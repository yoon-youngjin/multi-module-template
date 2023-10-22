package dev.yoon.storage.db.core

import javax.persistence.Entity

@Entity
internal class UserEntity(
    val name: String,
) : BaseEntity()