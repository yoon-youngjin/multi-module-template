package dev.yoon.multimoduletemplate

interface UserRepository { // 스프링과 jpa를 전혀 모르는 상태
    fun add(name: String): Long
    fun read(id: Long): User?
}