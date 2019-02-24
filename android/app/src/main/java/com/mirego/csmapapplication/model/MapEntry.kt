package com.mirego.csmapapplication.model

class MapEntry {
    private val name: String? = null

    private val component: String? = null

    private val notes: String? = null

    private val type: String? = null

    private val lat: Double? = null

    private val long: Double? = null

    private val address: String? = null

    override fun toString(): String {
        if (name != null) {
            return name
        } else {
            return "HELLO"
        }
    }
}