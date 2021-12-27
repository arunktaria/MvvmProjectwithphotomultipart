package com.example.mvvmproject.DataModels

import com.google.gson.annotations.SerializedName




data class User_Details(@SerializedName("patient_id") val patient_id : Int,
                        @SerializedName("doctor_id") val doctor_id : Int,
                        @SerializedName("doctor_name") val doctor_name : String,
                        @SerializedName("code") val code : Int,
                        @SerializedName("first_name") var first_name : String,
                        @SerializedName("last_name") var last_name : String,
                        @SerializedName("dob") var dob : String,
                        @SerializedName("email") var email : String,
                        @SerializedName("mobile") var mobile : String,
                        @SerializedName("profile_photo") var profile_photo : String,
                        @SerializedName("address") var address : String,
                        @SerializedName("country_id") var country_id : String,
                        @SerializedName("country") var country : String,
                        @SerializedName("state_id") var state_id : String,
                        @SerializedName("state") var state : String,
                        @SerializedName("city") var city : Any,
                        @SerializedName("zip_code") var zip_code : Int,
                        @SerializedName("sleep_timing_weekdays") val sleep_timing_weekdays : String?= "",
                        @SerializedName("hormone_timing_weekdays") val hormone_timing_weekdays : String? ="",
                        @SerializedName("sleep_timing_weekends") val sleep_timing_weekends : String? ="",
                        @SerializedName("hormone_timing_weekends") val hormone_timing_weekends : String? = "",
                        @SerializedName("joining_date") val joining_date : String,
                        @SerializedName("is_video_watched") var is_video_watched : Int,
                        @SerializedName("questionnaires") val questionnaires: List<QuestionnairesItem>?,
                        @SerializedName("appointments") val appointments: List<Appointment> = ArrayList(),
                        @SerializedName("status") var status : String)



data class QuestionnairesItem(@SerializedName("questionnaire_type") val questionnaireType: String = "",
                              @SerializedName("doctor_id") val doctorId: String = "",
                              @SerializedName("pdf") val pdf: String = "",
                              @SerializedName("questionnaire_id") val questionnaireId: String = "",
                              @SerializedName("profile_photo") val profilePhoto: String = "",
                              @SerializedName("questionnaire_name") val questionnaireName: String = "",
                              @SerializedName("questionnaire_date") val questionnaireDate: String = "",
                              @SerializedName("patient_id") val patientId: String = "",
                              @SerializedName("last_name") val lastName: String = "",
                              @SerializedName("first_name") val firstName: String = "",
                              @SerializedName("status") val status: String = "")

data class UserData(@SerializedName("patient_id") val patient_id : Int,
                    @SerializedName("doctor_id") val doctor_id : Int,
                    @SerializedName("doctor_name") val doctor_name : String,
                    @SerializedName("code") val code : Int,
                    @SerializedName("first_name") var first_name : String,
                    @SerializedName("last_name") var last_name : String,
                    @SerializedName("dob") var dob : String,
                    @SerializedName("email") var email : String,
                    @SerializedName("mobile") var mobile : String,
                    @SerializedName("profile_photo") var profile_photo : String,
                    @SerializedName("address") var address : String,
                    @SerializedName("country_id") var country_id : String,
                    @SerializedName("country") var country : String,
                    @SerializedName("state_id") var state_id : String,
                    @SerializedName("state") var state : String,
                    @SerializedName("city") var city : Any,
                    @SerializedName("zip_code") var zip_code : Int,
                    @SerializedName("sleep_timing_weekdays") val sleep_timing_weekdays : String?= "",
                    @SerializedName("hormone_timing_weekdays") val hormone_timing_weekdays : String? ="",
                    @SerializedName("sleep_timing_weekends") val sleep_timing_weekends : String? ="",
                    @SerializedName("hormone_timing_weekends") val hormone_timing_weekends : String? = "",
                    @SerializedName("joining_date") val joining_date : String,
                    @SerializedName("is_video_watched") var is_video_watched : Int,
                    @SerializedName("questionnaires") val questionnaires: List<QuestionnairesItem>?,
                    @SerializedName("appointments") val appointments: List<Appointment> = ArrayList(),
                    @SerializedName("status") var status : String)



data class Appointment(@SerializedName("appointment_id") val appointmentId: String = "",
                       @SerializedName("appointment_date") val appointmentDate: String = "",
                       @SerializedName("appointment_time") val appointmentTime: String = "",
                       @SerializedName("doctor_id") val doctorId: String = "",
                       @SerializedName("questionnaire_id") val questionnaireId: String = "",
                       @SerializedName("profile_photo") val profilePhoto: String = "",
                       @SerializedName("patient_id") val patientId: String = "",
                       @SerializedName("last_name") val lastName: String = "",
                       @SerializedName("first_name") val firstName: String = "",
                       @SerializedName("status") val status: String = "")
