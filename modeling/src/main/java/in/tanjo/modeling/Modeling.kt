package `in`.tanjo.modeling

import org.json.JSONObject

public interface Modeling<T> {

    fun fromJsonObject(jsonObject: JSONObject?): T?
}