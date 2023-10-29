package dev.yoon.multimoduletemplate.controller

import dev.yoon.multimoduletemplate.User

data class UserResponse(
    val name: String,
) {
    constructor(user: User) : this(user.name)
}
