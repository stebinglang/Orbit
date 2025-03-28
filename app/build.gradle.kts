
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)


}


android {

//    these might be necessary
    buildFeatures {
        viewBinding = true
    }
    viewBinding {
        enable = true // Use "enable" instead of "isEnabled" or "enabled"
    }


    namespace = "com.cs407.groupproject407"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.cs407.groupproject407"
        minSdk = 33
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

//repositories {
//    maven { url = uri("https://jitpack.io") }
//}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    //for Calendar
    implementation("com.kizitonwose.calendar:view:2.6.0")

    //for graph
    implementation("com.github.PhilJay:MPAndroidChart:v3.1.0")

}

