@file:JvmName("JsonableUtils")
package `in`.tanjo.modeling.extension

import `in`.tanjo.modeling.Jsonable

public fun Jsonable.toJson(): String {
    return  toJsonObject().toString()
}