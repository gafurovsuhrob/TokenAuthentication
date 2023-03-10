package com.mrntlu.tokenauthentication.repository

import com.mrntlu.tokenauthentication.models.Auth
import com.mrntlu.tokenauthentication.service.auth.AuthApiService
import com.mrntlu.tokenauthentication.utils.apiRequestFlow
import javax.inject.Inject

class AuthRepository @Inject constructor(
    private val authApiService: AuthApiService,
) {
    fun login(auth: Auth) = apiRequestFlow {
        authApiService.login(auth)
    }
}