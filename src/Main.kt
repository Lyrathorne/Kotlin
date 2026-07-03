enum class DeviceType{
    PHONE,
    DESKTOP,
    LAPTOP,
    TABLET
}

data class Device(
    val id: String,
    val name: String,
    val type: DeviceType,
    val ipAddress: String?,
    val batteryLevel: Int,
    val isOnline: Boolean


)