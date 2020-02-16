package data;

import android.provider.BaseColumns;

public final class PetContract {

    //create a private constructor
    private PetContract(){}
    //implement the baseColumn
    public static final class PetEntry implements BaseColumns{
        public final static String TABLE_NAME = "pets";
        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_PET_NAME = "name";
        public final static String COLUMN_PET_BREED="breed";
        public final static String COLUMN_PET_GENDER = "gender";
        public final static String COLUMN_PET_WEIGHT= "weight";

        //create constants for gender
        public static final int GENDER_UNKWOWN=0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;

    }
}
