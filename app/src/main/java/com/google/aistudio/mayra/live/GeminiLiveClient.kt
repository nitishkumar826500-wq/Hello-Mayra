package com.google.aistudio.mayra.live

import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.WebSocket
import okhttp3.WebSocketListener
import okio.ByteString

class GeminiLiveClient(
    private val onAudioChunkReceived: (ByteArray) -> Unit,
    private val onInterrupted: () -> Unit
) {

    private val client = OkHttpClient()
    private var webSocket: WebSocket? = null

    fun connect() {
        // Gemini Live connection will be configured here.
        // Do not put an API key directly in this source file.
    }

    fun sendAudioChunk(pcm16kBytes: ByteArray) {
        // Audio will be sent through the secure Gemini connection.
    }

    fun sendInterruptionSignal() {
        onInterrupted()
    }

    fun disconnect() {
        webSocket?.close(1000, "Mayra stopped")
        webSocket = null
    }
}
