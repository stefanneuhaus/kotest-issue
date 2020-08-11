import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.string.shouldContain

class KotlinTest : StringSpec({

    "Failing" {
        "failing-case" shouldContain "666"
    }
})
