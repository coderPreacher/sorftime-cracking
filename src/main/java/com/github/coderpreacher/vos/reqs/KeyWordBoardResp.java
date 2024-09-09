
package com.github.coderpreacher.vos.reqs;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * 关键词看板
 */
@Data
public class KeyWordBoardResp {
    private Long Number;
    private Long Id;
    private String Name;
    private String NameZH;
    private List<String> ImageList;
    private String KeywordTrend;
    private CpcTrend CpcTrend;
    private String BusySeason;
    private Long Top;
    private Long SearchVolume;
    private Long HoleAsinTotal;
    private Long HoleTotal;
    private BigDecimal HoleRate;
    private Long NatureHoleAsinTotal;
    private Long NatureHoleTotal;
    private BigDecimal NatureHoleRate;
    private Long AdHoleAsinTotal;
    private Long AdHoleTotal;
    private BigDecimal AdHoleRate;
    private BigDecimal SearchConversionRate;

    private Long NinetyBuyVolume;

    private Long CompetitorCount;

    private Long TopDiff;

    private BigDecimal GrowthRateSix;

    private BigDecimal GrowthRateThree;

    private BigDecimal GrowthRateTwelve;

    private BigDecimal ViewMonopoly;

    private BigDecimal BuyMonopoly;

    private List<Asin> AsinList;
    private List<Node> NodeList;
    private Long Page;
    private BigDecimal NaturalPage;
    private BigDecimal NaturalRank;
    private BigDecimal NaturalTotal;
    private BigDecimal SearchRank;
    private BigDecimal SearchTotal;
    private BigDecimal FlowDevote;
    private BigDecimal DevoteFlow;
    private BigDecimal NatrualDevoteFlow;
    private BigDecimal AdvertDevoteFlow;
    private String AsinFirstPage = null;
    private String AsinNoFirstPage = null;
    private BigDecimal SaleCount;
    private BigDecimal SaleCountDiff;
    private BigDecimal FlowType;
    private String FlowTypeDesc;
    private List<Object> ExtendList;
    private BigDecimal ViewRate;

    private BigDecimal BuyRate;

    private BigDecimal FallType;
    private BigDecimal ExitType;
    private String OfflineTime;
    private String OnLineTime;

    private BigDecimal HomeProductCount;
    private BigDecimal HomeNaturalCount;
    private BigDecimal HomeSaleCount;
    private BigDecimal HomeSaleRate;
    private BigDecimal HomeAdvertCount;
    private BigDecimal OPTop100Rate;
    private BigDecimal OPLRRate;
    private BigDecimal APLRRate;
    private BigDecimal ChangeRate;
    private BigDecimal HomeAvgScore;
    private BigDecimal HomeAvgComment;
    private BigDecimal HomeAvgPrice;
    private BigDecimal HomeCouponCount;
    private BigDecimal HomeCouponCountRate;
    private BigDecimal HomeOtherSellerCount;
    private BigDecimal HomeOtherSellerCountRate;
    private BigDecimal HomeLowestPrice;
    private BigDecimal HomeLowestPriceRate;
    private String NodeId;
    private BigDecimal NewType;
    private BigDecimal AvgCommentCount;
    private BigDecimal AvgScore;
    private BigDecimal AvgPrice;

    private BigDecimal AveragePrice;
    private BigDecimal AvgComentCount;

    private BigDecimal CommentCountListing;
    private BigDecimal CommentCountShare;
    private BigDecimal TypeAvgScore;
    private BigDecimal LowScoreCountRate;
    private BigDecimal LowScoreSaleCountRate;
    private BigDecimal BrandCount;
    private BigDecimal BrandPrevThree;
    private BigDecimal AvgCompeteCount;
    private BigDecimal SolderPrevThree;
    private BigDecimal MonthProductCount;
    private BigDecimal MonthProductCountShare;
    private BigDecimal AmzFbaRate;
    private BigDecimal FBARate;
    private BigDecimal CpcStorm;
    private BigDecimal CpcLow;
    private BigDecimal CpcHigh;

    private BigDecimal Sponsored;
    private BigDecimal NaturalType;
    private BigDecimal AdvertType;
    private BigDecimal RecomType;


    private String RankHistory;

    private BigDecimal KeywordNum;


    private BigDecimal NaturalDaysApart;
    private BigDecimal SearchDaysApart;


    @Data
    public static class Asin {
        private String ASIN;
        private BigDecimal ViewRate;
        private BigDecimal BuyRate;
        private String Image;
    }

    @Data
    public static class CpcTrend {
        private List<String> XAxis;
        private List<Object> Values;
        private float KeywordId;
    }

    @Data
    public static class Node {
        private String NodeId;
        private String Name;
        private Detail Detail;
    }

    @Data
    public static class Detail {
        /**
         * <pre>
         *
         * </pre>
         */
        private Integer SaleCountPrev;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer BrandPrev;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer SolderPrev;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer DogRate;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer DogCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer MonthProductCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer MonthProductCountShare;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer MonthScoreCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer MonthCommentCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer MonthHCCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer MonthLCCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer Id;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer TypeId;

        /**
         * <pre>
         *
         * </pre>
         */
        private String ListingUpdateTime;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer SorfTimeNumber;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ParentId;

        /**
         * <pre>
         * Dolls(玩偶)
         * </pre>
         */
        private String Name;

        /**
         * <pre>
         * 玩偶
         * </pre>
         */
        private String NameZH;

        /**
         * <pre>
         *
         * </pre>
         */
        private String Url;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer LastChildCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer SaleCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private String CreateTime;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ChildCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double AveragePrice;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer BrandCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer OneMonthProductCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer TwoMonthProductCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ThreeMonthProductCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer SixMonthProductCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer OneMonthCommentCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer TwoMonthCommentCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ThreeMonthCommentCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double SixMonthCommentCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer OneMonthScoreCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer TwoMonthScoreCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ThreeMonthScoreCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double SixMonthScoreCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer OneMonthHCCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer TwoMonthHCCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ThreeMonthHCCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer SixMonthHCCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer OneMonthLCCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer TwoMonthLCCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ThreeMonthLCCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer SixMonthLCCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private String UpdateTime;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer CompeteCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer FBMCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer OtherSellerRate;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer OwnRate;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer AmzFbaRate;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double FBAAverage;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer RankTotal;

        /**
         * <pre>
         *
         * </pre>
         */
        private String NodeId;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer NoBestSellers;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer Status;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double AvgSaleCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double AvgOtherSeller;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double AvgProfit;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double AvgRank;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double AvgComentCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double AvgScore;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer AvgCompeteCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer EbcRate;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer VideoRate;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer FirstRank;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double SaleCountPrevThree;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double SaleCountPrevFive;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double SaleCountPrevTen;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double SaleCountPrevTwenty;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double BrandPrevThree;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double BrandPrevFive;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double BrandPrevTen;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double BrandPrevTwenty;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double SolderPrevThree;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double SolderPrevFive;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double SolderPrevTen;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer SolderPrevTwenty;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer FirstSaleCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer LastSaleCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double LastSaleCountRate;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer FifthSaleCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer TenthSaleCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer TwentySaleCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer FiftySaleCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private String TopTenImage;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ProductCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private String Path;

        /**
         * <pre>
         * 玩具和游戏 -> 玩偶和配件 -> 玩偶
         * </pre>
         */
        private String PathZH;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double AvgVolume;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double AvgWeight;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double CPCAvgPrice;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer MonthAvgPrice;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer AvgZhl;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer RatingMonth;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double RatingStayMonth;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double SeaFirstVessel;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double AirFirstVessel;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double KdFirstVessel;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer NoScoreProductCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer FiveCommentCountListing;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double FiveCommentCountShare;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer TenCommentCountListing;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double TenCommentCountShare;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer TwentyCommentCountListing;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double TwentyCommentCountShare;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ThirtyCommentCountListing;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double ThirtyCommentCountShare;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer FiftyCommentCountListing;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double FiftyCommentCountShare;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer HundredCommentCountListing;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double HundredCommentCountShare;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer HFiftyCommentCountListing;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double HFiftyCommentCountShare;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer HTwoCommentCountListing;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double HTwoCommentCountShare;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer OneMonthProductCountShare;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer TwoMonthProductCountShare;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ThreeMonthProductCountShare;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double SixMonthProductCountShar;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double FBMCountShare;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double AmzFbaRateShare;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double EbcRateShare;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer RakeSaleCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double SalesVolume;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double AveBrandSale;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double AveBrandRevenue;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double AveSellerSale;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double AveSellerRevenue;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double Ratiooffirsttolast;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double Ratiooffirsttofive;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double Ratiooffirsttoten;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double Ratiooffirsttotwenty;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double Ratiooffirsttofifty;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer OneWeekSaleCountChange;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double OneWeekSaleCountChangeRate;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer MonthExpectAddRateNext;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer MonthExpectAddRateLast;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer SolderNumberCN;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double SolderRateCN;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double SolderSaleCountRateCN;

        /**
         * <pre>
         *
         * </pre>
         */
        private String FirstShelvesTime;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double AsinChangeRate;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer AveragePriceHB;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ScmTag;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double ThrowGoodsRate;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer NoBrandSaleRate;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer NoBrandRate;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double HFiveCommentCountShare;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer HFiveCommentCountListing;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer LowScoreThreeCountRate;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double LowScoreThreeSaleCountRate;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer LowScoreFourCountRate;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double LowScoreFourSaleCountRate;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer AddRateYearAvg;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer FBARate;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double GrossProfitMargin;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer SevenTightInventoryProductCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ThirtyTightInventoryProductCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer SevenOutStockProductCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ThirtyOutStockProductCount;

        /**
         * <pre>
         * BusySeason
         * </pre>
         */
        private String BusySeason;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer CyclicalMarket;

        /**
         * <pre>
         * LookDateStr
         * </pre>
         */
        private String LookDateStr;

        /**
         * <pre>
         * TopNodeName
         * </pre>
         */
        private String TopNodeName;

        /**
         * <pre>
         *
         * </pre>
         */
        private String TopNodeId;

        /**
         * <pre>
         *
         * </pre>
         */
        private String BestSellersIn;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer RegTrademark;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double BrandFlagship;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double BrandFlagshipShare;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer HighPrice;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double LowPrice;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer HighCommentCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer LowCommentCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer HighScore;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer LowScore;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer OneMonthProductCountWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer TwoMonthProductCountWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ThreeMonthProductCountWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer SixMonthProductCountWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer OneMonthCommentCountWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer TwoMonthCommentCountWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ThreeMonthCommentCountWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer SixMonthCommentCountWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer OneMonthScoreCountWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer TwoMonthScoreCountWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ThreeMonthScoreCountWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer SixMonthScoreCountWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer OneMonthHCCountWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer TwoMonthHCCountWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ThreeMonthHCCountWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer SixMonthHCCountWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer OneMonthLCCountWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer TwoMonthLCCountWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ThreeMonthLCCountWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer SixMonthLCCountWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer OneMonthProductCountShareWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer TwoMonthProductCountShareWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ThreeMonthProductCountShareWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer SixMonthProductCountShareWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer HavingVariantRate;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer AvgVariantCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer AvgBsrAsinChangeRate;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer AvgBsrAsinChangeRateThree;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer AvgBsrAsinChangeRateSix;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer FutrueTrend;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer OneDogCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer OneDogRate;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer SevenDogCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer SevenDogRate;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ThirtyDogCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ThirtyDogRate;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer SixtyDogCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer SixtyDogRate;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer OneEightyDogCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double OneEightyDogRate;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ExcludeNodeIDTag;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer OneMonthNewAsinCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer TwoMonthNewAsinCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ThreeMonthNewAsinCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer SixMonthNewAsinCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer OneMonthNewAsinCountWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer TwoMonthNewAsinCountWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ThreeMonthNewAsinCountWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer SixMonthNewAsinCountWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer OneMonthNewAvgPrice;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer TwoMonthNewAvgPrice;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ThreeMonthNewAvgPrice;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer SixMonthNewAvgPrice;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer OneMonthNewAvgPriceWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer TwoMonthNewAvgPriceWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ThreeMonthNewAvgPriceWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer SixMonthNewAvgPriceWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer OneMonthNewAvgSalecount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer TwoMonthNewAvgSalecount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ThreeMonthNewAvgSalecount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer SixMonthNewAvgSalecount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer OneMonthNewAvgSalecountWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer TwoMonthNewAvgSalecountWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ThreeMonthNewAvgSalecountWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer SixMonthNewAvgSalecountWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer OneMonthNewAvgSalesvolume;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer TwoMonthNewAvgSalesvolume;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ThreeMonthNewAvgSalesvolume;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer SixMonthNewAvgSalesvolume;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer OneMonthNewAvgSalesvolumeWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer TwoMonthNewAvgSalesvolumeWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ThreeMonthNewAvgSalesvolumeWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer SixMonthNewAvgSalesvolumeWithOutVariant;

        /**
         * <pre>
         *
         * </pre>
         */
        private String SaleTimeOldest;

        /**
         * <pre>
         *
         * </pre>
         */
        private String SaleTimeNewest;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer SaleTimeAvgDay;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer VariantsCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ReviewRateGood;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ReviewRateBad;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ReviewAddRateGood;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ReviewAddRateBad;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ReturnRatio;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ListingComplete;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double ReviewAddRateOne;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double ReviewStayRateOne;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ReviewStayRateThree;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double ReviewStayRateSix;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double ReviewStayRateYear;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer InternationalRate;

        /**
         * <pre>
         *
         * </pre>
         */
        private String DataboardUpdateTime;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer SixMonthPriceChangeRate;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer OneYearPriceChangeRate;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer TwoYearPriceChangeRate;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer SixMonthSaleCountChangeRate;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer OneYearSaleCountChangeRate;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer TwoYearSaleCountChangeRate;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer SixMonthPriceSaleChangeRate;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer OneYearPriceSaleChangeRate;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer TwoYearPriceSaleChangeRate;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer SixMonthSearchVolumeRate;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer OneYearSearchVolumeChangeRate;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer CommentSaleRate;

        /**
         * <pre>
         *
         * </pre>
         */
        private String NodeHistoryTime;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer NodeValueNum;

        /**
         * <pre>
         * NodeValueNumStr
         * </pre>
         */
        private String NodeValueNumStr;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer AddRate;

        /**
         * <pre>
         * AddRateAvg
         * </pre>
         */
        private String AddRateAvg;

        /**
         * <pre>
         * CustomerName
         * </pre>
         */
        private String CustomerName;

        /**
         * <pre>
         * SaleCountAvg
         * </pre>
         */
        private String SaleCountAvg;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer MonthExpectAddRateRange;

        /**
         * <pre>
         *
         * </pre>
         */
        private Double ReviewAddRateThree;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ReviewAddRateSix;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer ReviewAddRateYear;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer CommentCount;

        /**
         * <pre>
         *
         * </pre>
         */
        private Integer FourHundredSaleRate;

    }
}