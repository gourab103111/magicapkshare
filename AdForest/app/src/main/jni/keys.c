#include <jni.h>
JNIEXPORT jstring JNICALL
Java_com_scriptsbundle_adforest_SplashScreen_placeInitialize(JNIEnv *env, jobject instance) {
return (*env)-> NewStringUTF(env, "AIzaSyCzUfMhjQzO6e9ehaGYVI591yAdocdbjIQ");
}

JNIEXPORT jstring JNICALL
Java_com_scriptsbundle_adforest_messages_WhizzChat_Adapters_ChatAdapter_placeInitialize(JNIEnv *env,
                                                                                    jobject instance) {
    return (*env)-> NewStringUTF(env, "AIzaSyCzUfMhjQzO6e9ehaGYVI591yAdocdbjIQ");
}
JNIEXPORT jstring JNICALL
Java_com_scriptsbundle_adforest_App_placeInitialize(JNIEnv *env, jobject instance) {
return (*env)-> NewStringUTF(env, "AIzaSyCzUfMhjQzO6e9ehaGYVI591yAdocdbjIQ");
}

