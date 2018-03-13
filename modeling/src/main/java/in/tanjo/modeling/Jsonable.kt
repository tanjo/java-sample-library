package `in`.tanjo.modeling

import org.json.JSONObject

public interface Jsonable {

    fun toJsonObject(): JSONObject
}