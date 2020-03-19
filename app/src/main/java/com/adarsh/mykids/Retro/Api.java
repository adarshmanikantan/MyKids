package com.adarsh.mykids.Retro;

import com.adarsh.mykids.Retro.Model.AddChildModel;
import com.adarsh.mykids.Retro.Model.ComputerModel;
import com.adarsh.mykids.Retro.Model.EnglishModel;
import com.adarsh.mykids.Retro.Model.GrowthStageModel;
import com.adarsh.mykids.Retro.Model.MathsModel;
import com.adarsh.mykids.Retro.Model.ParentLoginModel;
import com.adarsh.mykids.Retro.Model.ParentRegistrationModel;
import com.adarsh.mykids.Retro.Model.ParentalTipsModel;
import com.adarsh.mykids.Retro.Model.ScienceModel;
import com.adarsh.mykids.Retro.Model.StoryModel;
import com.adarsh.mykids.Retro.Model.TofiveModel;
import com.adarsh.mykids.Retro.Model.ViewChildModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api{
   @GET("parent_reg.php?")
   Call<ParentRegistrationModel>PARENT_REGISTRATION_MODEL_CALL(@Query("name")String name, @Query("email")String email, @Query("phone")String phone, @Query("password")String password);

    @GET("parent_login.php?")
    Call<ParentLoginModel>PARENT_LOGIN_MODEL_CALL(@Query("phone")String phone, @Query("password")String password);

    @GET("child.php")
    Call<AddChildModel>ADD_CHILD_MODEL_CALL(@Query("id")String id,@Query("child_name")String child_name,@Query("dob")String dob,@Query("gender")String gender,@Query("age")String age);

    @GET("view_vaccination.php?")
    Call<ViewChildModel>VIEW_CHILD_MODEL_CALL(@Query("id")String id);

    @GET("view_video.php?")
    Call<TofiveModel>TOFIVE_MODEL_CALL();

    @GET("view_stories.php?")
    Call<StoryModel>STORY_MODEL_CALL();

 @GET("view_science.php?")
 Call<ScienceModel>SCIENCE_MODEL_CALL();

 @GET("view_maths.php?")
 Call<MathsModel>MATHS_MODEL_CALL();

 @GET("view_english.php?")
 Call<EnglishModel>ENGLISH_MODEL_CALL();

 @GET("view_computer.php?")
 Call<ComputerModel>COMPUTER_MODEL_CALL();

 @GET("view_stages.php?")
 Call<GrowthStageModel>GROWTH_STAGE_MODEL_CALL();


 @GET("view_health.php?")
 Call<ViewHealthConditionsModel>VIEW_HEALTH_CONDITIONS_MODEL_CALL();

 @GET("view_tips.php")
 Call<ParentalTipsModel>PARENTAL_TIPS_MODEL_CALL();
}
