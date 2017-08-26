package jdhe.iyibank.com.iyimeal.sqlitedb.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by Administrator on 2017/8/8.
 */

public class MySQLiteOpenHelper extends SQLiteOpenHelper {
    private static MySQLiteOpenHelper helper;

    //构造器,传入四个参数Context对象，数据库名字name，操作数据库的Cursor对象，版本号version。
    private MySQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    //为了简化构造器的使用，我们自定义一个构造器
    private MySQLiteOpenHelper(Context context, String name) {
        this(context, name, null, 1);//传入Context和数据库的名称，调用上面那个构造器
    }

    //将自定义的数据库创建类单例。
    public static synchronized MySQLiteOpenHelper getInstance(Context context) {
        if (helper == null) {
            helper = new MySQLiteOpenHelper(context, "iyirestaurant");//数据库名称为create_db。
        }
        return helper;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //在创建数据库时，初始化创建数据库中包含的数据库表。这里以一个“客户”的数据表为例
        /*
        customer   创建 "客户"数据表
         */
//        sqLiteDatabase.execSQL("create table if not exists " + TableConfig.TABLE_ACCOUNTS + "("
//                + TableConfig.Accounts.ID + " integer not null primary key autoincrement,"
//                + TableConfig.Accounts.BALANCE + " verchar(20),"
//                + TableConfig.Accounts.CREATETIME + " verchar(20),"
//                + TableConfig.Accounts.RECHARGE + " verchar(20) ,"
//                + TableConfig.Accounts.REMARKS + " verchar(20),"
//                + TableConfig.Accounts.REMARKS + " verchar(20), "
//                + TableConfig.Accounts.LAYERS + " verchar(20),"
//                + TableConfig.Accounts.CONTACTS + " verchar(20),"
//                + TableConfig.Accounts.REMARK + " verchar(20))");

        sqLiteDatabase.execSQL("CREATE TABLE if not exists" + TableConfig.TABLE_ACCOUNTS +
                "(" +
                        TableConfig.Accounts.ID + " integer not null primary key autoincrement,"
                        + TableConfig.Accounts.BALANCE + " double not null,"
                        + TableConfig.Accounts.CREATETIME + " data not null,"
                        + TableConfig.Accounts.RECHARGE + " double not null,"
                        + TableConfig.Accounts.REMARKS + " text,"
                        + TableConfig.Accounts.SHOPID + " integer,"
                        + TableConfig.Accounts.TOTALFREEMONEY + " double not null,"
                        + TableConfig.Accounts.UNIONID + " text(36) not null,"
                        + TableConfig.Accounts.USERID + "integer"
                        + ")");

        sqLiteDatabase.execSQL("CREATE TABLE if not exists" + TableConfig.TABLE_DESKS +
                "(" +
                TableConfig.Desks.ID + " integer not null primary key autoincrement,"
                + TableConfig.Desks.COGNATEID + " text,"
                + TableConfig.Desks.CREATETIME + " data not null,"
                + TableConfig.Desks.CREATEUSER + " integer not null,"
                + TableConfig.Desks.CUSTOMERLIMIT + "  integer not null,"
                + TableConfig.Desks.DESKFEE + " text,"
                + TableConfig.Desks.ENABLE + " bit not null,"
                + TableConfig.Desks.UNIONID + " text(36) not null,"
                + TableConfig.Desks.NAME + "TEXT,"

                + TableConfig.Desks.RANKNUM + "  INTEGER NOT NULL,"
                + TableConfig.Desks.REGIONID + " INT64 NOT NULL,"
                + TableConfig.Desks.REMARKS + " TEXT,"
                + TableConfig.Desks.SORTNAME + " TEXT,"
                + TableConfig.Desks.STATE + "INTEGER NOT NULL,"
                + TableConfig.Desks.STATEDINING + "INTEGER NOT NULL"
                + ")");

        sqLiteDatabase.execSQL("CREATE TABLE if not exists" + TableConfig.TABLE_ODRERITEMS +
                "(" +

        TableConfig.Orderitems.ID + " integer not null primary key autoincrement,"
                + TableConfig.Orderitems.COUNT + " INTEGER not null,"
                + TableConfig.Orderitems.DESKID + " INT64 not null,"
                + TableConfig.Orderitems.DESKNAME + " TEXT,"
                + TableConfig.Orderitems.ISFREE + " bit NOT NULL,"
                + TableConfig.Orderitems.MONEY + " double NOT NULL,"
                + TableConfig.Orderitems.ORDERID + " INT64 not null,"
                + TableConfig.Orderitems.UNIONID + " text(36) not null,"
                + TableConfig.Orderitems.PRODUCTID + "INT64 NOT NULL,"

                + TableConfig.Orderitems.PRODUCTNAME + " text,"
                + TableConfig.Orderitems.PRODUCTTYPEID + " INT64 NOT NULL,"
                + TableConfig.Orderitems.PRODUCTTYPENAME + " text"
                + ")");

        sqLiteDatabase.execSQL("CREATE TABLE if not exists" + TableConfig.TABLE_ORDERS +
                "(" +
//                        "ID" INT64 PRIMARY KEY AUTOINCREMENT NOT NULL,
//                "CreateDate" datetime NOT NULL,
//                "DeskCount" INTEGER NOT NULL,
//                "DiscountList" TEXT NULL,
//                "OrderNumber" TEXT NULL,
//                "OrderStatu" INTEGER NOT NULL,
//                "OrderTotalAmount" double NOT NULL,
//                "OrderType" INTEGER NOT NULL,
//                "OtherFeeTotalAmount" double NOT NULL,
//                "PayDate" datetime NOT NULL,
//                "Platform" INTEGER NULL,
//        "ProductCount" INTEGER NOT NULL,
//                "ProductTotalAmount" double NOT NULL,
//                "SellerRemark" TEXT NULL,
//        "SellerUser" INT64 NOT NULL,
//                "ShopID" INT64 NULL,
//        "UserRemark" TEXT NULL


        TableConfig.Orders.ID + " integer not null primary key autoincrement,"
                + TableConfig.Orders.CREATEDATE + " datetime not null,"
                + TableConfig.Orders.DESKCOUNT + " INTEGER not null,"
                + TableConfig.Orders.DISCOUNTLIST + " TEXT null,"
                + TableConfig.Orders.ORDERNUMBER + " text NULL,"
                + TableConfig.Orders.ORDERSTATU + " integer  NOT NULL,"
                + TableConfig.Orders.ORDERTATALAMOUNT + " double not null,"
                + TableConfig.Orders.USERREMARK + " text null,"
                + TableConfig.Orders.ORDERTYPE + "integer  NOT NULL,"
                + TableConfig.Orders.OTHERFEETOTALAMOUNT + " double not null,"
                + TableConfig.Orders.PAYDATA + " datetime NOT NULL,"
                + TableConfig.Orders.PLATFORM + " integer,"
                + TableConfig.Orders.PRODUCTCOUNT + " INTEGER not null,"
                + TableConfig.Orders.PRODUCTTOTALAMOUNT + " double not null,"
                + TableConfig.Orders.SELLERREMARK + "TEXT NULL,"
                + TableConfig.Orders.SELLERUSER + "INT64 NOT NULL,"
                + TableConfig.Orders.SHOPID + "integer"
                + ")");

        sqLiteDatabase.execSQL("CREATE TABLE if not exists" + TableConfig.TABLE_PAYSETTINGS +
                "(" +
//                        "Description" TEXT NULL,
//                "Encode" TEXT NULL,
//                "ImgUrl" TEXT NULL,
//                "LastModifyTime" datetime NOT NULL,
//                "Name" TEXT NULL,
//                "ScanType" TEXT NULL

                TableConfig.Paysettings.ID + " integer not null primary key autoincrement,"
                + TableConfig.Paysettings.DESCRIPTION + " TEXT null,"
                + TableConfig.Paysettings.ENCODE + " TEXT null,"
                + TableConfig.Paysettings.IMAGURL + " TEXT null,"
                + TableConfig.Paysettings.LASTMODIFYTIME + " datetime NOT NULL,"
                + TableConfig.Paysettings.NAME + " TEXT null,"
                + TableConfig.Paysettings.SCANTYPE + " TEXT null"
                + ")");

        sqLiteDatabase.execSQL("CREATE TABLE if not exists" + TableConfig.TABLE_PERMISSIONS +
                "(" +
                TableConfig.Permissions.ID + " integer not null primary key autoincrement,"
                + TableConfig.Permissions.NAME + " TEXT null,"
                + TableConfig.Permissions.UNIONID + " TEXT(36) NOT NULL"
                + ")");

        sqLiteDatabase.execSQL("CREATE TABLE if not exists" + TableConfig.TABLE_PRODUCTS +
                "(" +

//
//                        "CreateTime" datetime NOT NULL,
//                "CreateUserID" INT64 NULL,
//                "Enable" bit NOT NULL,
//                "ImageURL" TEXT NULL,
//                "IsReceiveLogo" bit NOT NULL,
//                "MemberPrice" decimal(65,30) NOT NULL,
//                "Name" TEXT NULL,
//                "NameEN" TEXT NULL,
//                "Price" decimal(65,30) NOT NULL,
//                "ProductCode" TEXT NULL,
//                "ProductType" INT64 NOT NULL,
//                "RankNum" INTEGER NOT NULL,
//                "Remarks" TEXT NULL,
//                "ShopId" TEXT NULL,
//                "SpecialPrice" decimal(65,30) NOT NULL,
//                "UnionID" TEXT(36) NOT NULL,
//                "UnitFormat" TEXT NULL,
//                "UnitSize" TEXT NULL
                TableConfig.Products.ID + " integer not null primary key autoincrement,"
                + TableConfig.Products.CREATETIME + " datetime not null,"
                + TableConfig.Products.CREATEUSERID + "INT64 null,"
                + TableConfig.Products.ENABLE + " bit not null,"
                + TableConfig.Products.IMAGEURL + " text,"
                + TableConfig.Products.ISRECEIVELOGO + " bit NOT NULL,"
                + TableConfig.Products.MEMBERPRICE + "  decimal(65,30) NOT NULL,"
                + TableConfig.Products.UNIONID + " text(36) not null,"
                + TableConfig.Products.NAME + "TEXT,"
                + TableConfig.Products.NAMEEN + " TEXT null,"
                + TableConfig.Products.PRICE + " decimal(65,30) NOT NULL,"
                + TableConfig.Products.PRODUCTCODE + " TEXT null,"
                + TableConfig.Products.RPODUCTTYPE + " INT64 NOT NULL,"
                + TableConfig.Products.RANKNUM + " integer  NOT NULL,"
                + TableConfig.Products.REMARKS + " TEXT null,"
                + TableConfig.Products.SHOPID + " text  null,"
                + TableConfig.Products.SPECIALPRICE + "decimal(65,30) NOT NULL,"
                + TableConfig.Products.UNITFORMAT + " text null,"
                + TableConfig.Products.UNITSIZE + " text  null"


                + ")");

        sqLiteDatabase.execSQL("CREATE TABLE if not exists" + TableConfig.TABLE_PRODUCTTYPES +
                "(" +
//                        "CreateTime" datetime NOT NULL,
//                "CreateUserID" INT64 NULL,
//                "Enable" bit NOT NULL,
//                "Name" TEXT NULL,
//                "Num" INTEGER NOT NULL,
//                "ParentTypeID" INT64 NULL,
//                "RankNum" INTEGER NOT NULL,
//                "Remarks" TEXT NULL,
//                "ShopID" INT64 NULL,
//                "UnionID" TEXT(36) NOT NULL

                TableConfig.Producttypes.ID + " integer not null primary key autoincrement,"
                + TableConfig.Producttypes.CREATETIME + " datetime not null,"
                + TableConfig.Producttypes.CREATEUSERID + " INT64 null,"
                + TableConfig.Producttypes.ENABLE + " bit not null,"
                + TableConfig.Producttypes.NAME + " text,"
                + TableConfig.Producttypes.NUM + " integer NOT NULL,"
                + TableConfig.Producttypes.PARENTTYPEID + "INT64 null,"
                + TableConfig.Producttypes.UNIONID + " text(36) not null,"
                + TableConfig.Producttypes.REMARKS + "TEXT,"
                + TableConfig.Producttypes.SHOPID + " INT64 null,"
                + TableConfig.Producttypes.RANKNUM + "integer NOT NULL"
                + ")");

        sqLiteDatabase.execSQL("CREATE TABLE if not exists" + TableConfig.TABLE_REGISONS +
                "(" +
//                        "CreateTime" datetime NOT NULL,
//                "CreateUserID" INT64 NULL,
//                "Enable" bit NOT NULL,
//                "Name" TEXT NULL,
//                "Remarks" TEXT NULL,
//                "ShopId" INT64 NOT NULL,

                TableConfig.Regions.ID + " integer not null primary key autoincrement,"
                + TableConfig.Regions.CREATETIME + " datetime not null,"
                + TableConfig.Regions.CREATEUSERID + " INT64 null,"
                + TableConfig.Regions.ENABLE + " bit not null,"
                + TableConfig.Regions.NAME + " text,"
                + TableConfig.Regions.REMARKS + " TEXT,"
                + TableConfig.Regions.SHOPID + " INT64 not null,"
                + TableConfig.Regions.UNIONID + " text(36) not null"
                + ")");

        sqLiteDatabase.execSQL("CREATE TABLE if not exists" + TableConfig.TABLE_SHOPMEMBERS +
                "(" +

//                "AccountBalance" double NOT NULL,
//                "AccountID" INT64 NULL,
//        "Address" TEXT NULL,
//        "Birthday" datetime NOT NULL,
//                "CardNo" TEXT NULL,
//        "CreateTime" datetime NOT NULL,
//                "CreateUserID" INT64 NULL,
//        "Enable" bit NOT NULL,
//                "Name" TEXT NULL,
//        "Phone" TEXT NULL,
//        "Remarks" TEXT NULL,
//        "ShopID" INT64 NULL,
                TableConfig.Shopmembers.ID + " integer not null primary key autoincrement,"
                + TableConfig.Shopmembers.ACCOUNTBALANCE + " double not null,"
                + TableConfig.Shopmembers.ACCOUNTID + " INT64 not null,"
                + TableConfig.Shopmembers.ADDRESS + " TEXT null,"
                + TableConfig.Shopmembers.BIRTHDAY + " datetime NOT NULL,"
                + TableConfig.Shopmembers.CARDNO + " TEXT,"
                + TableConfig.Shopmembers.CREATETIME + " datetime not null,"
                + TableConfig.Shopmembers.UNIONID + " text(36) not null,"
                + TableConfig.Shopmembers.CREATEUSERID + "INT64,"
                + TableConfig.Shopmembers.ENABLE + " bit NOT NULL,"
                + TableConfig.Shopmembers.NAME + " TEXT null,"
                + TableConfig.Shopmembers.PHONE + " text null,"
                + TableConfig.Shopmembers.REMARKS + "TEXT,"
                + TableConfig.Shopmembers.SHOPID + "INT64"
                + ")");

        sqLiteDatabase.execSQL("CREATE TABLE if not exists" + TableConfig.TABLE_SHOPPRINTSETINGS +
                "(" +

//                        "CreateTime" datetime NOT NULL,
//                "CreateUserID" INT64 NULL,
//                "LastUpdateDate" datetime NOT NULL,
//                "ShopID" INT64 NULL,
                TableConfig.Shopprintsettings.ID + " integer not null primary key autoincrement,"
                + TableConfig.Shopprintsettings.LASTUPDATATEDATE + " datetime not null,"
                + TableConfig.Shopprintsettings.CREATETIME + " datetime not null,"
                + TableConfig.Shopprintsettings.CREATEUSERID + " INT64 null,"
                + TableConfig.Shopprintsettings.SHOPID + " INT64,"
                + TableConfig.Shopprintsettings.UNIONID + " text(36) not null"
                + ")");

        sqLiteDatabase.execSQL("CREATE TABLE if not exists" + TableConfig.TABLE_SHOPS +
                "(" +
//                        "Address" TEXT NULL,
//                "BlueToothPrint" bit NOT NULL,
//                "Contractor" TEXT NULL,
//                "CreateDate" datetime NOT NULL,
//                "Description" TEXT NULL,
//                "IsKitchenPrint" bit NOT NULL,
//                "Name" TEXT NULL,

                TableConfig.Shops.ID + " integer not null primary key autoincrement,"
                + TableConfig.Shops.BLUETOOTHPRINT + " bit not null,"
                + TableConfig.Shops.CONTRACTOR + " TEXT null,"
                + TableConfig.Shops.ADDRESS + " TEXT null,"
                + TableConfig.Shops.CREATEDATE + " datetime NOT NULL,"
                + TableConfig.Shops.DESCRIPTION + " TEXT NULL,"
                + TableConfig.Shops.ISKITCHENPRINT + " bit not null,"
                + TableConfig.Shops.UNIONID + " text(36) not null,"
                + TableConfig.Shops.NAME + "TEXT"
                + ")");

        sqLiteDatabase.execSQL("CREATE TABLE if not exists" + TableConfig.TABLE_TRADERECORDS +
                "(" +
//                "Money" double NOT NULL,
//                "Remarks" TEXT NULL,
//        "ShopID" INT64 NULL,
//        "TradeTime" datetime NOT NULL,
//                "TradeType" INTEGER NOT NULL,
//                "UnionID" TEXT(36) NOT NULL,
//        "UserID" INT64 NULL
        TableConfig.Traderecords.ID + " integer not null primary key autoincrement,"
                + TableConfig.Traderecords.MONEY + " double not null,"
                + TableConfig.Traderecords.REMARKS + " TEXT null,"
                + TableConfig.Traderecords.SHOPID + " INT64 null,"
                + TableConfig.Traderecords.TRADETIME + " datetime NOT NULL,"
                + TableConfig.Traderecords.TRADETYPE + " integer NOT NULL,"
                + TableConfig.Traderecords.UNIONID + " text(36) not null,"
                + TableConfig.Traderecords.USERID + "INT64"
                + ")");

        sqLiteDatabase.execSQL("CREATE TABLE if not exists" + TableConfig.TABLE_USERS +
                "(" +

//                        "Email" TEXT NULL,
//                "Enable" bit NOT NULL,
//                "Gesturepassword" TEXT NULL,
//                "GesturepasswordState" INTEGER NOT NULL,
//                "HeadImgUrl" TEXT NULL,
//                "LastLoginTime" datetime NULL,
//                "MasterID" INT64 NULL,
//                "MobileNumber" TEXT NULL,
//                "NickName" TEXT NULL,
//                "Password" TEXT NULL,
//                "Permission" TEXT NULL,
//                "RegTime" datetime NOT NULL,
//                "ShopID" INT64 NULL,
//                "UnionID" TEXT(36) NOT NULL,
//                "Username" TEXT NULL
                TableConfig.Users.ID + " integer not null primary key autoincrement,"
                + TableConfig.Users.EMAIL + " TEXT null,"
                + TableConfig.Users.FESTUREPASSWORD + " TEXT null,"
                + TableConfig.Users.GEATUREPASSWORDSTATE + " INTEGER not null,"
                + TableConfig.Users.HEADIMAURL + " text,"
                + TableConfig.Users.LASTLOGINTIME + " datetime NULL,"
                + TableConfig.Users.MASTERID + " INT64 null,"
                + TableConfig.Users.UNIONID + " text(36) not null,"
                + TableConfig.Users.MOBILENUMBER + "TEXT,"
                + TableConfig.Users.ENABLE + " bit not null,"
                + TableConfig.Users.NICKNAME + " TEXT null,"
                + TableConfig.Users.PASSWORD + " text,"
                + TableConfig.Users.PERMISSION + " TEXT,"
                + TableConfig.Users.SHOPID + " INT64 null,"
                + TableConfig.Users.USERNAME + " text null,"
                + TableConfig.Users.REGTIME + "datetime NOT NULL"
                + ")");

        sqLiteDatabase.execSQL("CREATE TABLE if not exists" + TableConfig.TABLE_WORKSHIFTCHANGERECORDS +
                "(" +
//                        "ChangeTime" datetime NOT NULL,
//                "CreateTime" datetime NOT NULL,
//                "Reamrks" TEXT NULL,
//                "TotalReceiveMoney" double NOT NULL,
//                "UnionID" TEXT(36) NOT NULL,
//        "UserID" INT64 NULL,
//        "WorkShiftsID" INT64 NULL
        TableConfig.Workshiftchangerecords.ID + " integer not null primary key autoincrement,"
                + TableConfig.Workshiftchangerecords.CHANGETIME + " datetime not null,"
                + TableConfig.Workshiftchangerecords.CREATETIME + " datetime not null,"
                + TableConfig.Workshiftchangerecords.TOTALRECEIVEMONEY + " double not null,"
                + TableConfig.Workshiftchangerecords.REAMRKS + " text,"
                + TableConfig.Workshiftchangerecords.WORKSHIFTSID + " integer,"
                + TableConfig.Workshiftchangerecords.UNIONID + " text(36) not null,"
                + TableConfig.Workshiftchangerecords.USERID + "integer"
                + ")");

        sqLiteDatabase.execSQL("CREATE TABLE if not exists" + TableConfig.TABLE_WORKSHIFTS +
                "(" +
//                        "CreateTime" datetime NOT NULL,
//                "CreateUserID" INT64 NULL,
//                "Enable" bit NOT NULL,
//                "EndTime" TEXT NULL,
//                "IsOverDayShifts" bit NOT NULL,
//                "Name" TEXT NULL,
//                "Remarks" TEXT NULL,
//                "StartTime" TEXT NULL,
//                "UnionID" TEXT(36) NOT NULL

                TableConfig.Workshifts.ID + " integer not null primary key autoincrement,"
                + TableConfig.Workshifts.CREATEUSERID + " INT64 null,"
                + TableConfig.Workshifts.CREATETIME + " datetime not null,"
                + TableConfig.Workshifts.ENABLE + " bit not null,"
                + TableConfig.Workshifts.REAMRKS + " text,"
                + TableConfig.Workshifts.NAME + " text,"
                + TableConfig.Workshifts.ENDTIME + " text,"
                + TableConfig.Workshifts.ISOVERDAYSHIFTS + " bit not null,"
                + TableConfig.Workshifts.UNIONID + " text(36) not null,"
                + TableConfig.Workshifts.STARTTIME + "text"
                + ")");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        //用于升级数据库，只需要在创建本类对象时传入一个比之前创建传入的version大的数即可。
    }
}
