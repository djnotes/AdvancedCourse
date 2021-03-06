package sematec.advance.utils;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import sematec.advance.login.User;
import sematec.advance.utils.webmodels.WebIMDBModel;

/**
 * Created by amirhossein on 12/29/17.
 */

public interface WebServiceInterface {

//    @GET("/")
//    Call<WebIMDBModel> searchWord(@Query("t") String t , @Query("apikey") String apikey);

    @GET("/")
    Observable<WebIMDBModel> searchWord(@Query("t") String t , @Query("apikey") String apikey);

    @FormUrlEncoded
    @POST("/")
    Call<User> createUser(@Body User user);


}
