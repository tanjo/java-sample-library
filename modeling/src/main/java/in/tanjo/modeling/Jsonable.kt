package `in`.tanjo.modeling

import org.json.JSONObject

interface Jsonable {

    fun toJsonObject(): JSONObject
}