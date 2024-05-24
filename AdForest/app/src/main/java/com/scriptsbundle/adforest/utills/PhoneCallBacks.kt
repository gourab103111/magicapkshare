package com.scriptsbundle.adforest.utills
import com.google.firebase.FirebaseException
import com.google.firebase.auth.PhoneAuthCredential
import com.google.firebase.auth.PhoneAuthProvider

class PhoneCallbacks(private val listener : PhoneCallbacksListener) : PhoneAuthProvider.OnVerificationStateChangedCallbacks() {

    interface PhoneCallbacksListener {
        fun onVerificationCompleted(credential: PhoneAuthCredential?)
        fun onVerificationFailed(exception: FirebaseException?)
        fun onCodeSent(
                verificationId: String?,
                token: PhoneAuthProvider.ForceResendingToken?
        )
    }

//    override fun onVerificationCompleted(phoneAuthCredential: PhoneAuthCredential?) {
//        listener.onVerificationCompleted(phoneAuthCredential)
//    }
//
//    override fun onVerificationFailed(exception: FirebaseException?) {
//        listener.onVerificationFailed(exception)
//    }
//
//    override fun onCodeSent(verificationId: String?, token: PhoneAuthProvider.ForceResendingToken?) {
//        listener.onCodeSent(verificationId,token)
//    }



    override fun onVerificationCompleted(p0: PhoneAuthCredential) {
        listener.onVerificationCompleted(p0)
    }

    override fun onVerificationFailed(p0: FirebaseException) {
        listener.onVerificationFailed(p0)
    }
    override fun onCodeSent(p0: String, p1: PhoneAuthProvider.ForceResendingToken) {
        listener.onCodeSent(p0, p1)
    }
}