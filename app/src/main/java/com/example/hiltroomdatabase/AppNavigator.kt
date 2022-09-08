
package com.example.hiltroomdatabase

enum class Screens {
    BUTTONS,
    LOGS
}

interface AppNavigator {
    fun navigateTo(screen: Screens)
}
