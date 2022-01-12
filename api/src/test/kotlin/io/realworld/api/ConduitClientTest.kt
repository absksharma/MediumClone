package io.realworld.api

import io.realworld.api.models.entities.SignupData
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test
import kotlin.random.Random

class ConduitClientTest {
    private val conduitClient = ConduitClient()

    @Test
    suspend fun `Get articles`() {
        runBlocking {
            val articles = conduitClient.api.getArticles().execute()
            assertNotNull(articles.body()?.articles)
        }
    }

//    @Test
//    suspend fun `Create a User`() {
//        val userCreds = SignupData(
//            "testemail${Random.nextInt(999, 9999)}@test.com",
//            "pass${Random.nextInt(9999, 99999)}",
//            "rand_user_${Random.nextInt(99, 999)}"
//
//        )
//        runBlocking {
//
//            val articles = conduitClient.api.signupUser(SignupData(userCreds))
//            assertEquals(userCreds.username, articles.body()?.user?.username)
//        }
//    }


}
