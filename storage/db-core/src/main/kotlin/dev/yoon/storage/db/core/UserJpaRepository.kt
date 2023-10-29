package dev.yoon.storage.db.core

import org.springframework.data.jpa.repository.JpaRepository

internal interface UserJpaRepository : JpaRepository<UserEntity, Long>