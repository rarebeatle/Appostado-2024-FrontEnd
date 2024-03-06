package com.proyecto.cuatro.appostados.ui.login

/**
 * Authentication result : success (user details) or error message.
 */
data class LoginResult(
    val success: LoggedInUserView? = null,
    val error: LoginActivity.LoginErrorType? = null
)