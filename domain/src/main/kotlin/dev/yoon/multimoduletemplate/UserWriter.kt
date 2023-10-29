package dev.yoon.multimoduletemplate

import org.springframework.stereotype.Component

@Component
class UserWriter(
    private val userRepository: UserRepository,
) {

    fun add(name: String): Long {
        return userRepository.add(name)
    }
}