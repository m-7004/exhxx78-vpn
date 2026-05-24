package com.exhxx78.vpn2.dto

data class OutboundTrafficStat(
    val tag: String,
    val direction: String,
    val value: Long,
)