package `in`.tanjo.modeling.extension

import `in`.tanjo.modeling.Jsonable

fun Jsonable.toJson(): String {
    return  toJsonObject().toString()
}