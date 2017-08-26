package jdhe.iyibank.com.iyimeal.sqlitedb.db;

/**
 * Created by Administrator on 2017/8/8.
 */

public class TableConfig {
    public static final String TABLE_ACCOUNTS = "accounts" ;
    /**
     * Accounts数据表的字段
     */
    public static class Accounts{
        //Accounts
        public static final String ID="ID";
        public static final String BALANCE="Balance";
        public static final String CREATETIME="CreateTime";
        public static final String RECHARGE="Recharge";
        public static final String REMARKS="Remarks";
        public static final String SHOPID="ShopID";
        public static final String TOTALFREEMONEY="TotalFreeMoney";
        public static final String UNIONID="UnionID";
        public static final String USERID="UserID";
    }
    public static final String TABLE_DESKS = "desks";
    /**
     * Desks数据表的字段
     */
    public static class Desks{
        //Desks
        public static final String ID="ID";
        public static final String COGNATEID="CognateId" ;
        public static final String CREATETIME="CreateTime";
        public static final String CREATEUSER="CreateUser";
        public static final String CUSTOMERLIMIT="CustomerLimit";
        public static final String DESKFEE="DeskFee";
        public static final String ENABLE="Enable";
        public static final String UNIONID="UnionID";
        public static final String NAME="Name";
        public static final String RANKNUM="RankNum";
        public static final String REGIONID="RegionId";
        public static final String REMARKS="Remarks";
        public static final String SORTNAME="SortName";
        public static final String STATE="State";
        public static final String STATEDINING="StateDining";
    }

    public static final String TABLE_ODRERITEMS="orderitems"  ;

    /**
     * Orderitems数据表的字段
     */
    public static class Orderitems{
        public static final String ID="ID";
        public static final String COUNT="Count" ;
        public static final String DESKID="DeskId";
        public static final String DESKNAME="DeskName";
        public static final String ISFREE="IsFree";
        public static final String MONEY="Money";
        public static final String ORDERID="OrderID";
        public static final String UNIONID="UnionID";
        public static final String PRODUCTID="ProductId";
        public static final String PRODUCTNAME="ProductName";
        public static final String PRODUCTTYPEID="ProductTypeId";
        public static final String PRODUCTTYPENAME="ProductTypeName";
    }


    public static final String TABLE_ORDERS = "orders"  ;

    /**
     * Orders数据表的字段
     */
    public static class Orders{
        public static final String ID="ID";
        public static final String CREATEDATE="CreateDate" ;
        public static final String DESKCOUNT="DeskCount";
        public static final String DISCOUNTLIST="DiscountList";
        public static final String ORDERNUMBER="OrderNumber";
        public static final String ORDERSTATU="OrderStatu";
        public static final String ORDERTATALAMOUNT="OrderTotalAmount";
        public static final String USERREMARK="UserRemark";
        public static final String ORDERTYPE="OrderType";
        public static final String OTHERFEETOTALAMOUNT="OtherFeeTotalAmount";
        public static final String PAYDATA="PayDate";
        public static final String PLATFORM="Platform";
        public static final String PRODUCTCOUNT="ProductCount";
        public static final String PRODUCTTOTALAMOUNT="ProductTotalAmount";
        public static final String SELLERREMARK="SellerRemark";
        public static final String SELLERUSER="SellerUser";
        public static final String SHOPID="ShopID";
    }

    public static final String TABLE_PAYSETTINGS = "paysettings";


    /**
     * Paysettings数据表的字段
     */
    public static class Paysettings{
        public static final String ID="ID";
        public static final String DESCRIPTION="Description"  ;
        public static final String ENCODE="Encode" ;
        public static final String IMAGURL="ImgUrl";
        public static final String LASTMODIFYTIME="LastModifyTime";
        public static final String NAME="Name";
        public static final String SCANTYPE="ScanType";
    }

    public static final String TABLE_PERMISSIONS = "permissions" ;

    /**
     * Permissions数据表的字段
     */
    public static class Permissions{
        public static final String ID="ID";
        public static final String NAME="Name";
        public static final String UNIONID="UnionID" ;
    }


    public static final String TABLE_PRODUCTS = "products" ;

    /**
     * Products数据表的字段
     */
    public static class Products{
        public static final String ID="ID";
        public static final String CREATETIME="CreateTime"  ;
        public static final String CREATEUSERID="CreateUserID" ;
        public static final String ENABLE="Enable";
        public static final String IMAGEURL="ImageURL";
        public static final String ISRECEIVELOGO="IsReceiveLogo";
        public static final String MEMBERPRICE="MemberPrice";
        public static final String NAME="Name";
        public static final String NAMEEN="NameEN";
        public static final String PRICE="Price";
        public static final String PRODUCTCODE="ProductCode" ;
        public static final String RPODUCTTYPE="ProductType" ;
        public static final String RANKNUM="RankNum" ;
        public static final String REMARKS="Remarks" ;
        public static final String SHOPID="ShopId";
        public static final String SPECIALPRICE="SpecialPrice";
        public static final String UNIONID="UnionID";
        public static final String UNITFORMAT="UnitFormat" ;
        public static final String UNITSIZE="UnitSize";
    }


    public static final String TABLE_PRODUCTTYPES = "producttypes" ;

    /**
     * Producttypes数据表的字段
     */
    public static class Producttypes{
        public static final String ID="ID";
        public static final String CREATETIME="CreateTime"  ;
        public static final String CREATEUSERID="CreateUserID" ;
        public static final String ENABLE="Enable";
        public static final String NAME="Name";
        public static final String NUM="Num";
        public static final String PARENTTYPEID="ParentTypeID";
        public static final String RANKNUM="RankNum" ;
        public static final String REMARKS="Remarks" ;
        public static final String SHOPID="ShopID";
        public static final String UNIONID="UnionID";
    }

    public static final String TABLE_REGISONS = "regions" ;

    /**
     * Regions数据表的字段
     */
    public static class Regions{
        public static final String ID="ID";
        public static final String CREATETIME="CreateTime"  ;
        public static final String CREATEUSERID="CreateUserID" ;
        public static final String ENABLE="Enable";
        public static final String NAME="Name";
        public static final String REMARKS="Remarks" ;
        public static final String SHOPID="ShopId";
        public static final String UNIONID="UnionID";
    }

    public static final String TABLE_SHOPMEMBERS = "shopmembers" ;

    /**
     * Shopmembers数据表的字段
     */
    public static class Shopmembers{
        public static final String ID="ID";
        public static final String ACCOUNTBALANCE="AccountBalance"  ;
        public static final String ACCOUNTID="AccountID" ;
        public static final String ADDRESS="Address";
        public static final String BIRTHDAY ="Birthday";
        public static final String CARDNO="CardNo";
        public static final String CREATETIME="CreateTime";
        public static final String CREATEUSERID="CreateUserID" ;
        public static final String ENABLE="Enable";
        public static final String NAME="Name";
        public static final String PHONE="Phone";
        public static final String REMARKS="Remarks" ;
        public static final String SHOPID="ShopID";
        public static final String UNIONID="UnionID";
    }

    public static final String TABLE_SHOPPRINTSETINGS = "shopprintsettings"  ;

    /**
     * Shopprintsettings数据表的字段
     */
    public static class Shopprintsettings{
        public static final String ID="ID";
        public static final String LASTUPDATATEDATE="LastUpdateDate"  ;
        public static final String CREATETIME="CreateTime";
        public static final String CREATEUSERID="CreateUserID" ;
        public static final String SHOPID="ShopID";
        public static final String UNIONID="UnionID";
    }

    public static final String TABLE_SHOPS = "shops" ;

    /**
     * Shops数据表的字段
     */
    public static class Shops{
        public static final String ID="ID";
        public static final String BLUETOOTHPRINT="BlueToothPrint"  ;
        public static final String CONTRACTOR="Contractor" ;
        public static final String ADDRESS="Address";
        public static final String CREATEDATE ="CreateDate";
        public static final String DESCRIPTION="Description";
        public static final String ISKITCHENPRINT="IsKitchenPrint";
        public static final String NAME="Name";
        public static final String UNIONID="UnionID";
    }

    public static final String TABLE_TRADERECORDS = "traderecords" ;

    /**
     * Traderecords数据表的字段
     */
    public static class Traderecords{
        public static final String ID="ID";
        public static final String MONEY="Money"  ;
        public static final String REMARKS="Remarks" ;
        public static final String SHOPID="ShopID";
        public static final String TRADETIME ="TradeTime";
        public static final String TRADETYPE="TradeType";
        public static final String USERID="UserID";
        public static final String UNIONID="UnionID";
    }

    public static final String TABLE_USERS = "users" ;

    /**
     * Users数据表的字段
     */
    public static class Users{
        public static final String ID="ID";
        public static final String EMAIL="Email"  ;
        public static final String FESTUREPASSWORD="Gesturepassword" ;
        public static final String GEATUREPASSWORDSTATE="GesturepasswordState";
        public static final String HEADIMAURL ="HeadImgUrl";
        public static final String LASTLOGINTIME="LastLoginTime";
        public static final String MASTERID="MasterID";
        public static final String MOBILENUMBER="MobileNumber" ;
        public static final String ENABLE="Enable";
        public static final String NICKNAME="NickName";
        public static final String PASSWORD="Password";
        public static final String PERMISSION="Permission" ;
        public static final String SHOPID="ShopID";
        public static final String UNIONID="UnionID";
        public static final String REGTIME="RegTime";
        public static final String USERNAME="Username";
    }


    public static final String TABLE_WORKSHIFTCHANGERECORDS= "workshiftchangerecords" ;

    /**
     * Workshiftchangerecords数据表的字段
     */
    public static class Workshiftchangerecords{
        public static final String ID="ID";
        public static final String CHANGETIME="ChangeTime"  ;
        public static final String CREATETIME="CreateTime" ;
        public static final String REAMRKS="Reamrks";
        public static final String TOTALRECEIVEMONEY ="TotalReceiveMoney";
        public static final String WORKSHIFTSID="WorkShiftsID";
        public static final String USERID="UserID";
        public static final String UNIONID="UnionID";
    }


    public static final String TABLE_WORKSHIFTS = "workshifts" ;


    /**
     * Workshifts数据表的字段
     */
    public static class Workshifts{
        public static final String ID="ID";
        public static final String CREATEUSERID="CreateUserID"  ;
        public static final String CREATETIME="CreateTime" ;
        public static final String REAMRKS="Reamrks";
        public static final String ENABLE ="Enable";
        public static final String ENDTIME="EndTime";
        public static final String ISOVERDAYSHIFTS="IsOverDayShifts";
        public static final String STARTTIME="StartTime";
        public static final String NAME="Name";
        public static final String UNIONID="UnionID";
    }



}
