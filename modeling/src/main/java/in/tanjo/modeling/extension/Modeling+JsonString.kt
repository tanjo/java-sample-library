package `in`.tanjo.modeling.extension

import `in`.tanjo.modeling.Modeling
import org.json.JSONObject

public fun <T> Modeling<T>.fromJson(json: String?): T? {
    if (json.isNullOrEmpty()) {
        return null
    }
    return fromJsonObject(JSONObject(json))
}