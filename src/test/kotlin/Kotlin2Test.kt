import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.string.shouldContain

class Kotlin2Test : StringSpec({

    "Passing" {
        "passing-case" shouldContain "ing-ca"
    }
})
