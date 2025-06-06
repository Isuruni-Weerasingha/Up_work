plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.upwork"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.upwork"
        minSdk = 24
        targetSdk = 35
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

 //   implementation(libs.androidx.cardview)
    implementation(libs.play.services.ads)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.mediation.test.suite)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    // for navigation
    implementation(libs.androidx.navigation.fragment)
    implementation(libs.androidx.navigation.ui)

}