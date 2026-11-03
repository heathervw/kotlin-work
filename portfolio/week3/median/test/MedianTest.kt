// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
        }
    // Write four more tests here

    "Median when size=1" {
        val num = listOf(4.0f)
        median(num) shouldBe 4.0f
    }

    "Median when size=2" {
        val num = listOf(4.0f,3.0f)
        median(num) shouldBe 3.5f
    }

    "Median when size=3" {
        val num = listOf(4.0f,3.0f,6.0f)
        median(num) shouldBe 4.0f
    }

    "Median when size=4" {
        val num = listOf(4.0f, 3.0f, 6.0f, 9.0f)
        median(num) shouldBe 5.0f
    }
})

