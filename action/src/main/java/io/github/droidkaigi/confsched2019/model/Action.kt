package io.github.droidkaigi.confsched2019.model

sealed class Action {
    data class AllSessionLoaded(val sessions: List<Session>) : Action()
    object UserRegistered : Action()
}