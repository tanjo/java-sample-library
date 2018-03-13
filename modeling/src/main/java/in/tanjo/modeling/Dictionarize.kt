package `in`.tanjo.modeling

interface Dictionarize {

    fun toDictionary(): Map<String, @JvmSuppressWildcards Any>
}