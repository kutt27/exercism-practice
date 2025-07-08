class Acronym {
    static String abbreviate(String phrase) {
        if (!phrase) return "" // return nothing if input string empty
        def cleaned = phrase.replaceAll(/[^A-Za-z0-9\s\-]/, "") // // removing all punctuation except hyphens and whitespaces
        def words = cleaned.split(/[\s\-_]+/) // removing spaces, hyphens and underscores
        return words.collect {it[0].toUpperCase()}.join('') // return the first letter of each word in a string after capitilizing it
    }
}