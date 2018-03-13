package `in`.tanjo.modeling

import org.json.JSONObject

interface Modeling<T> {

    fun fromJsonObject(jsonObject: JSONObject?): T?
}