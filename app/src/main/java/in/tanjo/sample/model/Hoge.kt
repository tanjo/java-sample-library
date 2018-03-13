package `in`.tanjo.sample.model

import `in`.tanjo.modeling.Jsonable
import `in`.tanjo.modeling.Modeling
import org.json.JSONException
import org.json.JSONObject

data class Hoge(var fuga: String?): Jsonable {

    companion object: Modeling<Hoge> {
        override fun fromJsonObject(jsonObject: JSONObject?): Hoge? {
            if (jsonObject == null) {
                return null
            }
            try {
                if (jsonObject.length() == 0) {
                    return null
                }
                return Hoge(
                        jsonObject.optString("fuga")
                )
            } catch (ignore: Exception) {
                return null
            }
        }
    }

    override fun toJsonObject(): JSONObject {
        val jsonObject = JSONObject()
        try {
            jsonObject.putOpt("fuga", fuga)
        } catch (ignore: JSONException) {
        }
        return jsonObject
    }
}