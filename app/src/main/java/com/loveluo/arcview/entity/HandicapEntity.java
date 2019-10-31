package com.loveluo.arcview.entity;

import java.math.BigDecimal;
import java.util.List;

/**
 * 盘口实体类
 */
public class HandicapEntity {


    /**
     * code : 8008
     * data : {"list":{"SellList":[{"amountPrice":0.29,"assetTypeId":0,"countUnfilledVolume":5000,"createDate":0,"direction":2,"id":7,"memberId":0,"orderStatus":0},{"amountPrice":0.28,"assetTypeId":0,"countUnfilledVolume":218,"createDate":0,"direction":2,"id":6,"memberId":0,"orderStatus":0},{"amountPrice":0.26,"assetTypeId":0,"countUnfilledVolume":82,"createDate":0,"direction":2,"id":5,"memberId":0,"orderStatus":0},{"amountPrice":0.25,"assetTypeId":0,"countUnfilledVolume":98,"createDate":0,"direction":2,"id":4,"memberId":0,"orderStatus":0},{"amountPrice":0.23,"assetTypeId":0,"countUnfilledVolume":350,"createDate":0,"direction":2,"id":3,"memberId":0,"orderStatus":0},{"amountPrice":0.22,"assetTypeId":0,"countUnfilledVolume":311,"createDate":0,"direction":2,"id":2,"memberId":0,"orderStatus":0},{"amountPrice":0.21,"assetTypeId":0,"countUnfilledVolume":184,"createDate":0,"direction":2,"id":1,"memberId":0,"orderStatus":0}],"buyList":[{"amountPrice":0.1755,"assetTypeId":0,"countUnfilledVolume":15,"createDate":0,"direction":1,"id":1,"memberId":0,"orderStatus":0},{"amountPrice":0.1725,"assetTypeId":0,"countUnfilledVolume":34,"createDate":0,"direction":1,"id":2,"memberId":0,"orderStatus":0},{"amountPrice":0.1721,"assetTypeId":0,"countUnfilledVolume":195,"createDate":0,"direction":1,"id":3,"memberId":0,"orderStatus":0},{"amountPrice":0.1603,"assetTypeId":0,"countUnfilledVolume":255,"createDate":0,"direction":1,"id":4,"memberId":0,"orderStatus":0},{"amountPrice":0.1601,"assetTypeId":0,"countUnfilledVolume":1680,"createDate":0,"direction":1,"id":5,"memberId":0,"orderStatus":0},{"amountPrice":0.16,"assetTypeId":0,"countUnfilledVolume":50,"createDate":0,"direction":1,"id":6,"memberId":0,"orderStatus":0},{"amountPrice":0.158,"assetTypeId":0,"countUnfilledVolume":7510.22,"createDate":0,"direction":1,"id":7,"memberId":0,"orderStatus":0}]},"pageSize":0,"quoteChange":"+1.98%"}
     * message : 成功
     */

    private int code;
    private DataBean data;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class DataBean {
        /**
         * list : {"SellList":[{"amountPrice":0.29,"assetTypeId":0,"countUnfilledVolume":5000,"createDate":0,"direction":2,"id":7,"memberId":0,"orderStatus":0},{"amountPrice":0.28,"assetTypeId":0,"countUnfilledVolume":218,"createDate":0,"direction":2,"id":6,"memberId":0,"orderStatus":0},{"amountPrice":0.26,"assetTypeId":0,"countUnfilledVolume":82,"createDate":0,"direction":2,"id":5,"memberId":0,"orderStatus":0},{"amountPrice":0.25,"assetTypeId":0,"countUnfilledVolume":98,"createDate":0,"direction":2,"id":4,"memberId":0,"orderStatus":0},{"amountPrice":0.23,"assetTypeId":0,"countUnfilledVolume":350,"createDate":0,"direction":2,"id":3,"memberId":0,"orderStatus":0},{"amountPrice":0.22,"assetTypeId":0,"countUnfilledVolume":311,"createDate":0,"direction":2,"id":2,"memberId":0,"orderStatus":0},{"amountPrice":0.21,"assetTypeId":0,"countUnfilledVolume":184,"createDate":0,"direction":2,"id":1,"memberId":0,"orderStatus":0}],"buyList":[{"amountPrice":0.1755,"assetTypeId":0,"countUnfilledVolume":15,"createDate":0,"direction":1,"id":1,"memberId":0,"orderStatus":0},{"amountPrice":0.1725,"assetTypeId":0,"countUnfilledVolume":34,"createDate":0,"direction":1,"id":2,"memberId":0,"orderStatus":0},{"amountPrice":0.1721,"assetTypeId":0,"countUnfilledVolume":195,"createDate":0,"direction":1,"id":3,"memberId":0,"orderStatus":0},{"amountPrice":0.1603,"assetTypeId":0,"countUnfilledVolume":255,"createDate":0,"direction":1,"id":4,"memberId":0,"orderStatus":0},{"amountPrice":0.1601,"assetTypeId":0,"countUnfilledVolume":1680,"createDate":0,"direction":1,"id":5,"memberId":0,"orderStatus":0},{"amountPrice":0.16,"assetTypeId":0,"countUnfilledVolume":50,"createDate":0,"direction":1,"id":6,"memberId":0,"orderStatus":0},{"amountPrice":0.158,"assetTypeId":0,"countUnfilledVolume":7510.22,"createDate":0,"direction":1,"id":7,"memberId":0,"orderStatus":0}]}
         * pageSize : 0
         * quoteChange : +1.98%
         */

        private ListBean list;
        private int pageSize;
        private String quoteChange;

        public ListBean getList() {
            return list;
        }

        public void setList(ListBean list) {
            this.list = list;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public String getQuoteChange() {
            return quoteChange;
        }

        public void setQuoteChange(String quoteChange) {
            this.quoteChange = quoteChange;
        }

        public static class ListBean {
            private List<SellListBean> SellList;
            private List<BuyListBean> buyList;

            public List<SellListBean> getSellList() {
                return SellList;
            }

            public void setSellList(List<SellListBean> SellList) {
                this.SellList = SellList;
            }

            public List<BuyListBean> getBuyList() {
                return buyList;
            }

            public void setBuyList(List<BuyListBean> buyList) {
                this.buyList = buyList;
            }

            public static class SellListBean {
                /**
                 * amountPrice : 0.29
                 * assetTypeId : 0
                 * countUnfilledVolume : 5000.0
                 * createDate : 0
                 * direction : 2
                 * id : 7
                 * memberId : 0
                 * orderStatus : 0
                 */

                private int id;
                private int memberId;
                private int direction;
                private BigDecimal amountPrice;
                private BigDecimal amountTotal;
                private BigDecimal accountCommission;
                private BigDecimal acountTransaction;
                private BigDecimal countUnfilledVolume;
                private int orderStatus;
                private long createDate;
                private int assetTypeId;
                private String updateTime;
                private BigDecimal depth;

                public BigDecimal getDepth() {
                    if (depth == null) {
                        return new BigDecimal("0");
                    }
                    return depth;
                }

                public void setDepth(BigDecimal depth) {
                    this.depth = depth;
                }


                public int getAssetTypeId() {
                    return assetTypeId;
                }

                public void setAssetTypeId(int assetTypeId) {
                    this.assetTypeId = assetTypeId;
                }

                public BigDecimal getAmountPrice() {
                    return amountPrice;
                }

                public void setAmountPrice(BigDecimal amountPrice) {
                    this.amountPrice = amountPrice;
                }

                public BigDecimal getAmountTotal() {
                    return amountTotal;
                }

                public void setAmountTotal(BigDecimal amountTotal) {
                    this.amountTotal = amountTotal;
                }

                public BigDecimal getAccountCommission() {
                    return accountCommission;
                }

                public void setAccountCommission(BigDecimal accountCommission) {
                    this.accountCommission = accountCommission;
                }

                public BigDecimal getAcountTransaction() {
                    return acountTransaction;
                }

                public void setAcountTransaction(BigDecimal acountTransaction) {
                    this.acountTransaction = acountTransaction;
                }

                public BigDecimal getCountUnfilledVolume() {
                    return countUnfilledVolume;
                }

                public void setCountUnfilledVolume(BigDecimal countUnfilledVolume) {
                    this.countUnfilledVolume = countUnfilledVolume;
                }

                public long getCreateDate() {
                    return createDate;
                }

                public void setCreateDate(long createDate) {
                    this.createDate = createDate;
                }

                public String getUpdateTime() {
                    return updateTime;
                }

                public void setUpdateTime(String updateTime) {
                    this.updateTime = updateTime;
                }

                public void setCreateDate(int createDate) {
                    this.createDate = createDate;
                }

                public int getDirection() {
                    return direction;
                }

                public void setDirection(int direction) {
                    this.direction = direction;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getMemberId() {
                    return memberId;
                }

                public void setMemberId(int memberId) {
                    this.memberId = memberId;
                }

                public int getOrderStatus() {
                    return orderStatus;
                }

                public void setOrderStatus(int orderStatus) {
                    this.orderStatus = orderStatus;
                }
            }

            public static class BuyListBean {
                /**
                 * amountPrice : 0.1755
                 * assetTypeId : 0
                 * countUnfilledVolume : 15.0
                 * createDate : 0
                 * direction : 1
                 * id : 1
                 * memberId : 0
                 * orderStatus : 0
                 */

                private int id;
                private int memberId;
                private int direction;
                private BigDecimal amountPrice;
                private BigDecimal amountTotal;
                private BigDecimal accountCommission;
                private BigDecimal acountTransaction;
                private BigDecimal countUnfilledVolume;
                private int orderStatus;
                private long createDate;
                private int assetTypeId;
                private String updateTime;

                private BigDecimal depth;

                public BigDecimal getDepth() {
                    if (depth == null) {
                        return new BigDecimal("0");
                    }
                    return depth;
                }

                public void setDepth(BigDecimal depth) {
                    this.depth = depth;
                }


                public BigDecimal getAmountPrice() {
                    return amountPrice;
                }

                public void setAmountPrice(BigDecimal amountPrice) {
                    this.amountPrice = amountPrice;
                }

                public BigDecimal getAmountTotal() {
                    return amountTotal;
                }

                public void setAmountTotal(BigDecimal amountTotal) {
                    this.amountTotal = amountTotal;
                }

                public BigDecimal getAccountCommission() {
                    return accountCommission;
                }

                public void setAccountCommission(BigDecimal accountCommission) {
                    this.accountCommission = accountCommission;
                }

                public BigDecimal getAcountTransaction() {
                    return acountTransaction;
                }

                public void setAcountTransaction(BigDecimal acountTransaction) {
                    this.acountTransaction = acountTransaction;
                }

                public BigDecimal getCountUnfilledVolume() {
                    return countUnfilledVolume;
                }

                public void setCountUnfilledVolume(BigDecimal countUnfilledVolume) {
                    this.countUnfilledVolume = countUnfilledVolume;
                }

                public long getCreateDate() {
                    return createDate;
                }

                public void setCreateDate(long createDate) {
                    this.createDate = createDate;
                }

                public String getUpdateTime() {
                    return updateTime;
                }

                public void setUpdateTime(String updateTime) {
                    this.updateTime = updateTime;
                }

                public int getAssetTypeId() {
                    return assetTypeId;
                }

                public void setAssetTypeId(int assetTypeId) {
                    this.assetTypeId = assetTypeId;
                }


                public void setCreateDate(int createDate) {
                    this.createDate = createDate;
                }

                public int getDirection() {
                    return direction;
                }

                public void setDirection(int direction) {
                    this.direction = direction;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getMemberId() {
                    return memberId;
                }

                public void setMemberId(int memberId) {
                    this.memberId = memberId;
                }

                public int getOrderStatus() {
                    return orderStatus;
                }

                public void setOrderStatus(int orderStatus) {
                    this.orderStatus = orderStatus;
                }
            }
        }
    }
}
