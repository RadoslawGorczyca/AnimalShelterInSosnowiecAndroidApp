package pl.radoslawgorczyca.animalsheltersosnowiec.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by Radek on 09-Jan-18.
 */

public class PetContract {

    private PetContract() {
    }

    public static final int PET_LOADER_ID = 1;

    public static final String SHELTER_REQUEST_URL =
            "http://gorczyca.org/schronisko-sosnowiec/getJson.php";

    public static final String SHELTER_POST_URL =
            "http://gorczyca.org/schronisko-sosnowiec/insertData.php";

    public static final String SHELTER_UPDATE_URL =
            "http://gorczyca.org/schronisko-sosnowiec/updateData.php";

    public static final String SHELTER_DELETE_URL =
            "http://gorczyca.org/schronisko-sosnowiec/deleteData.php";

    public static final String SHELTER_USER_GET_URL =
            "http://gorczyca.org/schronisko-sosnowiec/getUserJson.php";

    public static final String SHELTER_USER_INSERT_URL =
            "http://gorczyca.org/schronisko-sosnowiec/insertUser.php";

    public static final String FTP_URL =
            "ftp.gorczyca.org";

    public static final int FTP_PORT =
            21;

    public static final String FTP_USERNAME =
            "nex_gorczyca";

    public static final String FTP_PASSWORD =
            "1Jabadabadu1";

    public static final String FTP_PHOTO_URL =
            "http://gorczyca.org/schronisko-sosnowiec/photos/";

    public static final String FTP_NO_PHOTO_DOG =
            "nodog.png";

    public static final String FTP_NO_PHOTO_CAT =
            "nocat.png";




    public static final String CONTENT_AUTHORITY = "pl.radoslawgorczyca.animalsheltersosnowiec";

    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    public static final String PATH_PETS = "pets";

    public static final class PetEntry implements BaseColumns {

        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PETS);

        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PETS;

        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PETS;

        public final static String TABLE_NAME = "Pet";

        public final static String _ID = BaseColumns._ID;

        public final static String COLUMN_PET_SPECIES = "species";

        public final static String COLUMN_PET_CODE = "code";

        public final static String COLUMN_PET_NAME = "name";

        public final static String COLUMN_PET_STATUS = "status";

        public final static String COLUMN_PET_GENDER = "gender";

        public final static String COLUMN_PET_HEIGHT = "height";

        public final static String COLUMN_PET_BIRTHYEAR = "birthYear";

        public final static String COLUMN_PET_ACCEPTANCEDATE = "acceptanceDate";

        public final static String COLUMN_PET_STERILIZED = "sterilized";

        public final static String COLUMN_PET_SUMMARY = "summary";

        public final static String COLUMN_PET_IMAGE = "image";

        public final static String COLUMN_PET_BREED = "breed";

        public final static String COLUMN_PET_CONTACTNUMBER = "contactNumber";

        public static final int SPECIES_DOG = 1;
        public static final int SPECIES_CAT = 2;

        public static final int STATUS_ADOPTABLE = 1;
        public static final int STATUS_QUARANTINE = 2;
        public static final int STATUS_BOOKED = 3;

        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;

        public static final int HEIGHT_SMALL = 1;
        public static final int HEIGHT_MEDIUM = 2;
        public static final int HEIGHT_BIG = 3;

        public static final int STERILIZED_YES = 1;
        public static final int STERILIZED_NO = 2;

        public static boolean isValidSpecies(int species) {
            return species == SPECIES_DOG || species == SPECIES_CAT;
        }

        public static boolean isValidGender(int gender) {
            return gender == GENDER_MALE || gender == GENDER_FEMALE;
        }

        public static boolean isValidStatus(int status) {
            return status == STATUS_ADOPTABLE || status == STATUS_QUARANTINE || status == STATUS_BOOKED;
        }

        public static boolean isValidHeight(int height) {
            return height == HEIGHT_SMALL || height == HEIGHT_MEDIUM || height == HEIGHT_BIG;
        }

        public static boolean isValidSterilized(int sterilized) {
            return sterilized == STERILIZED_YES || sterilized == STERILIZED_NO;
        }
    }

    public static final class UserEntry implements BaseColumns {
        public final static String TABLE_NAME = "User";

        public final static String COLUMN_USER_ID = "idUser";

        public final static String COLUMN_USER_EMAIL = "email";

        public final static String COLUMN_USER_NAME = "name";

        public final static String COLUMN_USER_SURNAME = "surname";

        public final static String COLUMN_USER_PASSWORD = "password";

    }
}
