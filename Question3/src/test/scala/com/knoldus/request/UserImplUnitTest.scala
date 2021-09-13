package com.knoldus.request
import com.knoldus.models.User
import com.knoldus.validator.UserValidator
import org.mockito.MockitoSugar.{mock, when}
import org.scalatest.flatspec.AnyFlatSpec

class UserImplUnitTest extends AnyFlatSpec {

  val mockedUserValidator = mock[UserValidator]
  val MayankUser: User = User("Mayank","Rajput",22,"Knoldus","mayank.rajput@knoldus.com")

  "User" should "be created" in {
    val userImpl = new UserImpl(mockedUserValidator)

    when(mockedUserValidator.userIsValid(MayankUser)) thenReturn(true)
    val result = userImpl.createUser(MayankUser)
    assert(!result.isEmpty)
  }

  "User" should "not be created" in {
    val userImpl = new UserImpl(mockedUserValidator)

    when(mockedUserValidator.userIsValid(MayankUser)) thenReturn(false)
    val result = userImpl.createUser(MayankUser)
    assert(result.isEmpty)
  }

}
