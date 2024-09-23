plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.vetlink"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.vetlink"
        minSdk = 24
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
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    //retrofit library
    implementation ("com.squareup.retrofit2:retrofit:2.11.0")

    //gson converter library
    implementation ("com.squareup.retrofit2:converter-gson:2.11.0")
    implementation ("com.google.code.gson:gson:2.11.0")

    //okhttp library
    implementation ("com.squareup.okhttp3:okhttp:4.12.0")

    //circular view
    implementation ("com.mikhaellopez:circularimageview:4.3.1")
}