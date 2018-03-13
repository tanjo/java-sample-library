package `in`.tanjo.modeling

import org.json.JSONArray

interface Listable<T> {

    fun fromJsonArray(jsonArray: JSONArray?): List<T>

    fun toJsonArray(list: List<T>?): JSONArray?
}