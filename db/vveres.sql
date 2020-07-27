/*
 Navicat Premium Data Transfer

 Source Server         : vveres
 Source Server Type    : MySQL
 Source Server Version : 100411
 Source Host           : localhost:3306
 Source Schema         : vveres

 Target Server Type    : MySQL
 Target Server Version : 100411
 File Encoding         : 65001

 Date: 23/06/2020 15:30:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for product_unit
-- ----------------------------
DROP TABLE IF EXISTS `product_unit`;
CREATE TABLE `product_unit`  (
  `product_id` bigint(20) NOT NULL,
  `unit_id` bigint(20) NOT NULL,
  PRIMARY KEY (`product_id`, `unit_id`) USING BTREE,
  INDEX `FK5o2qst8dibjxuvdj5xnnys5tm`(`unit_id`) USING BTREE,
  CONSTRAINT `FK2nce4bab9i1p13ptwt8v1ey9f` FOREIGN KEY (`product_id`) REFERENCES `tb_product` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK5o2qst8dibjxuvdj5xnnys5tm` FOREIGN KEY (`unit_id`) REFERENCES `tb_unit` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product_unit
-- ----------------------------
INSERT INTO `product_unit` VALUES (1, 1);
INSERT INTO `product_unit` VALUES (2, 1);

-- ----------------------------
-- Table structure for tb_bill
-- ----------------------------
DROP TABLE IF EXISTS `tb_bill`;
CREATE TABLE `tb_bill`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_date` datetime(0) NOT NULL,
  `customer_id` bigint(20) NOT NULL,
  `description` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `discount` bigint(20) NOT NULL,
  `ordertable_id` bigint(20) NOT NULL,
  `restaurant_id` bigint(20) NOT NULL,
  `staffment_id` bigint(20) NOT NULL,
  `status` bit(1) NOT NULL,
  `title` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `total_money` bigint(20) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_customer
-- ----------------------------
DROP TABLE IF EXISTS `tb_customer`;
CREATE TABLE `tb_customer`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `birthday` datetime(0) NOT NULL,
  `debtmoney` double NOT NULL,
  `fax` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `image` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `note` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `phone` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `restaurant_id` bigint(20) NOT NULL,
  `title` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `customergroupid` bigint(20) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FK1it8yguys9kkixagucx1tp121`(`customergroupid`) USING BTREE,
  CONSTRAINT `FK1it8yguys9kkixagucx1tp121` FOREIGN KEY (`customergroupid`) REFERENCES `tb_customer_group` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_customer
-- ----------------------------
INSERT INTO `tb_customer` VALUES (1, '1', '2020-06-22 11:41:28', 1, '1', '1', '1', '1', 1, '1', 1);

-- ----------------------------
-- Table structure for tb_customer_group
-- ----------------------------
DROP TABLE IF EXISTS `tb_customer_group`;
CREATE TABLE `tb_customer_group`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `note` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `parent_id` bigint(20) NOT NULL,
  `restaurant_id` bigint(20) NOT NULL,
  `title` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_customer_group
-- ----------------------------
INSERT INTO `tb_customer_group` VALUES (1, '1', 1, 1, '1');

-- ----------------------------
-- Table structure for tb_customer_group_customer
-- ----------------------------
DROP TABLE IF EXISTS `tb_customer_group_customer`;
CREATE TABLE `tb_customer_group_customer`  (
  `tb_customer_group_id` bigint(20) NOT NULL,
  `customer_id` bigint(20) NOT NULL,
  PRIMARY KEY (`tb_customer_group_id`, `customer_id`) USING BTREE,
  UNIQUE INDEX `UK_6ypc6vp9sh7e5almjpliv4665`(`customer_id`) USING BTREE,
  CONSTRAINT `FK1nfhnvcongr2oth89iv2xkdtm` FOREIGN KEY (`customer_id`) REFERENCES `tb_customer` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FKh5d5fvm0rqw7iukt7hy3a54ks` FOREIGN KEY (`tb_customer_group_id`) REFERENCES `tb_customer_group` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_department
-- ----------------------------
DROP TABLE IF EXISTS `tb_department`;
CREATE TABLE `tb_department`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `note` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `parent_id` bigint(20) NOT NULL,
  `restaurant_id` bigint(20) NOT NULL,
  `title` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_detail_bill
-- ----------------------------
DROP TABLE IF EXISTS `tb_detail_bill`;
CREATE TABLE `tb_detail_bill`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `bill_id` bigint(20) NOT NULL,
  `note` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `order_count` bigint(20) NOT NULL,
  `product_id` bigint(20) NOT NULL,
  `restaurant_id` bigint(20) NOT NULL,
  `unit_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_discount_product
-- ----------------------------
DROP TABLE IF EXISTS `tb_discount_product`;
CREATE TABLE `tb_discount_product`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `dua_date` datetime(0) NOT NULL,
  `note` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `price` double NOT NULL,
  `product_id` bigint(20) NOT NULL,
  `restaurant_id` bigint(20) NOT NULL,
  `start_date` datetime(0) NOT NULL,
  `store_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_export_detail
-- ----------------------------
DROP TABLE IF EXISTS `tb_export_detail`;
CREATE TABLE `tb_export_detail`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `discountmo` double NOT NULL,
  `discountmo1` double NOT NULL,
  `discountper` double NOT NULL,
  `expirydate` datetime(0) NOT NULL,
  `exportnum` double NOT NULL,
  `exportprice` double NOT NULL,
  `freenum` double NOT NULL,
  `total` double NOT NULL,
  `exportinvoiceid` bigint(20) NOT NULL,
  `productid` bigint(20) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FKapjipo8xi75qgw9icuhkyxjmb`(`exportinvoiceid`) USING BTREE,
  INDEX `FKa3l2g6cgrocf2qa0vnjp096lc`(`productid`) USING BTREE,
  CONSTRAINT `FKa3l2g6cgrocf2qa0vnjp096lc` FOREIGN KEY (`productid`) REFERENCES `tb_product` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FKapjipo8xi75qgw9icuhkyxjmb` FOREIGN KEY (`exportinvoiceid`) REFERENCES `tb_export_invoice` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_export_detail
-- ----------------------------
INSERT INTO `tb_export_detail` VALUES (1, 111, 1, 1, '2020-06-22 11:42:38', 1, 1, 1, 1, 1, 1);
INSERT INTO `tb_export_detail` VALUES (2, 11, 11, 1, '2020-06-22 11:45:05', 1, 1, 1, 0, 1, 2);

-- ----------------------------
-- Table structure for tb_export_invoice
-- ----------------------------
DROP TABLE IF EXISTS `tb_export_invoice`;
CREATE TABLE `tb_export_invoice`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `debt` double NOT NULL,
  `deposit` double NOT NULL,
  `invoicedate` datetime(0) NOT NULL,
  `invoicename` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `payment` double NOT NULL,
  `restaurant_id` bigint(20) NOT NULL,
  `total` double NOT NULL,
  `customerid` bigint(20) NOT NULL,
  `type_im_ex_product_id` bigint(20) NOT NULL,
  `storeid` bigint(20) NOT NULL,
  `staffmentid` bigint(20) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FK743gidmn4fs500y04ispx1iy1`(`customerid`) USING BTREE,
  INDEX `FK77efy25t6of3k6onpd1b98hbp`(`type_im_ex_product_id`) USING BTREE,
  INDEX `FK82rje5sacjf9rud2gsf9rpar3`(`storeid`) USING BTREE,
  INDEX `FKq47hsx6moh0joahl86f9dcig`(`staffmentid`) USING BTREE,
  CONSTRAINT `FK743gidmn4fs500y04ispx1iy1` FOREIGN KEY (`customerid`) REFERENCES `tb_customer` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK77efy25t6of3k6onpd1b98hbp` FOREIGN KEY (`type_im_ex_product_id`) REFERENCES `tb_type_imex_product` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK82rje5sacjf9rud2gsf9rpar3` FOREIGN KEY (`storeid`) REFERENCES `tb_store` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FKq47hsx6moh0joahl86f9dcig` FOREIGN KEY (`staffmentid`) REFERENCES `tb_staffment` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_export_invoice
-- ----------------------------
INSERT INTO `tb_export_invoice` VALUES (1, '1', 1, 1, '2020-06-22 11:41:45', 'test demo export invoice', 11, 1, 111, 1, 1, 1, 1);

-- ----------------------------
-- Table structure for tb_group_product
-- ----------------------------
DROP TABLE IF EXISTS `tb_group_product`;
CREATE TABLE `tb_group_product`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `parent_id` bigint(20) NOT NULL,
  `restaurant_id` bigint(20) NOT NULL,
  `title` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_group_product
-- ----------------------------
INSERT INTO `tb_group_product` VALUES (1, 'aaaa', 1, 1, 'tes group');

-- ----------------------------
-- Table structure for tb_import_detail
-- ----------------------------
DROP TABLE IF EXISTS `tb_import_detail`;
CREATE TABLE `tb_import_detail`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `active` bit(1) NULL DEFAULT NULL,
  `debtmoney` double NOT NULL,
  `discountmo` double NOT NULL,
  `discountmo1` double NOT NULL,
  `discountper` double NOT NULL,
  `expirydate` datetime(0) NOT NULL,
  `freenum` double NOT NULL,
  `importnum` double NOT NULL,
  `importprice` double NOT NULL,
  `note` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `total` double NOT NULL,
  `invoicedid` bigint(20) NOT NULL,
  `productid` bigint(20) NOT NULL,
  `restaurantid` bigint(20) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FKjabxotxdu2ya6yi32xvsfyrvg`(`invoicedid`) USING BTREE,
  INDEX `FKj2ux070wf8vow725el8edx4ff`(`productid`) USING BTREE,
  INDEX `FKp0qfhp8uwami1oyqek1ajf6ro`(`restaurantid`) USING BTREE,
  CONSTRAINT `FKj2ux070wf8vow725el8edx4ff` FOREIGN KEY (`productid`) REFERENCES `tb_product` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FKjabxotxdu2ya6yi32xvsfyrvg` FOREIGN KEY (`invoicedid`) REFERENCES `tb_import_invoice` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FKp0qfhp8uwami1oyqek1ajf6ro` FOREIGN KEY (`restaurantid`) REFERENCES `tb_restaurant` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_import_export_sepcial
-- ----------------------------
DROP TABLE IF EXISTS `tb_import_export_sepcial`;
CREATE TABLE `tb_import_export_sepcial`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `export_id` bigint(20) NOT NULL,
  `import_id` bigint(20) NOT NULL,
  `restaurant_id` bigint(20) NOT NULL,
  `typeieproduct` bigint(20) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_import_invoice
-- ----------------------------
DROP TABLE IF EXISTS `tb_import_invoice`;
CREATE TABLE `tb_import_invoice`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `debt` double NOT NULL,
  `deposit` double NOT NULL,
  `invoicedate` datetime(0) NOT NULL,
  `invoicename` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `payment` double NOT NULL,
  `total` double NOT NULL,
  `type_im_ex_product_id` bigint(20) NOT NULL,
  `restaurantid` bigint(20) NOT NULL,
  `suppilerid` bigint(20) NOT NULL,
  `staffmentid` bigint(20) NOT NULL,
  `storeid` bigint(20) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FK429wv2n9budcbwkif2m1ygp3h`(`type_im_ex_product_id`) USING BTREE,
  INDEX `FK3ef61jg3flmwqiygtpj29gv5e`(`restaurantid`) USING BTREE,
  INDEX `FKbgda3df4k90hnp3titri4jkaf`(`suppilerid`) USING BTREE,
  INDEX `FKll2nt9f4h91tke5o5r4ketv5v`(`staffmentid`) USING BTREE,
  INDEX `FK5fhw6jpw24ttnvqe7yvu3rl6c`(`storeid`) USING BTREE,
  CONSTRAINT `FK3ef61jg3flmwqiygtpj29gv5e` FOREIGN KEY (`restaurantid`) REFERENCES `tb_restaurant` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK429wv2n9budcbwkif2m1ygp3h` FOREIGN KEY (`type_im_ex_product_id`) REFERENCES `tb_type_imex_product` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK5fhw6jpw24ttnvqe7yvu3rl6c` FOREIGN KEY (`storeid`) REFERENCES `tb_store` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FKbgda3df4k90hnp3titri4jkaf` FOREIGN KEY (`suppilerid`) REFERENCES `tb_supplier` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FKll2nt9f4h91tke5o5r4ketv5v` FOREIGN KEY (`staffmentid`) REFERENCES `tb_staffment` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_in_ex
-- ----------------------------
DROP TABLE IF EXISTS `tb_in_ex`;
CREATE TABLE `tb_in_ex`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `in_ex` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `note` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `title` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `restaurantid` bigint(20) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FKrs28wjahxb602we6120km8hdy`(`restaurantid`) USING BTREE,
  CONSTRAINT `FKrs28wjahxb602we6120km8hdy` FOREIGN KEY (`restaurantid`) REFERENCES `tb_restaurant` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_invertory
-- ----------------------------
DROP TABLE IF EXISTS `tb_invertory`;
CREATE TABLE `tb_invertory`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `expiry_date` datetime(0) NOT NULL,
  `importinvoice_id` bigint(20) NOT NULL,
  `note` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `product_num` double NOT NULL,
  `restaurant_id` bigint(20) NOT NULL,
  `status` bit(1) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_loss_product
-- ----------------------------
DROP TABLE IF EXISTS `tb_loss_product`;
CREATE TABLE `tb_loss_product`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `importprice` double NOT NULL,
  `lossdate` datetime(0) NOT NULL,
  `lossnum` double NOT NULL,
  `note` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `restaurantid` bigint(20) NOT NULL,
  `status` bit(1) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_order_table
-- ----------------------------
DROP TABLE IF EXISTS `tb_order_table`;
CREATE TABLE `tb_order_table`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `note` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `seating` int(11) NOT NULL,
  `status` bit(1) NULL DEFAULT NULL,
  `title` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `restaurantid` bigint(20) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FKs20u5umtntg0jyv2qvf2gvqh9`(`restaurantid`) USING BTREE,
  CONSTRAINT `FKs20u5umtntg0jyv2qvf2gvqh9` FOREIGN KEY (`restaurantid`) REFERENCES `tb_restaurant` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_preparation
-- ----------------------------
DROP TABLE IF EXISTS `tb_preparation`;
CREATE TABLE `tb_preparation`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `productnum` double NOT NULL,
  `status` bit(1) NULL DEFAULT NULL,
  `restaurantid` bigint(20) NOT NULL,
  `productid` bigint(20) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FKdg1s62v8m3s2kurd02tqf0mn4`(`restaurantid`) USING BTREE,
  INDEX `FK72x1k8mxr285a7d0gjugvr6u5`(`productid`) USING BTREE,
  CONSTRAINT `FK72x1k8mxr285a7d0gjugvr6u5` FOREIGN KEY (`productid`) REFERENCES `tb_product` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FKdg1s62v8m3s2kurd02tqf0mn4` FOREIGN KEY (`restaurantid`) REFERENCES `tb_restaurant` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_preparation_detail
-- ----------------------------
DROP TABLE IF EXISTS `tb_preparation_detail`;
CREATE TABLE `tb_preparation_detail`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `productnum` double NOT NULL,
  `status` bit(1) NULL DEFAULT NULL,
  `restaurantid` bigint(20) NOT NULL,
  `preparationid` bigint(20) NOT NULL,
  `productid` bigint(20) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FKfrdw4cep1rm5uowdq2pb2pnk0`(`restaurantid`) USING BTREE,
  INDEX `FK1mbohvyicgsyrmqi64r6s41st`(`preparationid`) USING BTREE,
  INDEX `FK3vtj9kmuf4vr03j3clag6ilp8`(`productid`) USING BTREE,
  CONSTRAINT `FK1mbohvyicgsyrmqi64r6s41st` FOREIGN KEY (`preparationid`) REFERENCES `tb_preparation` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK3vtj9kmuf4vr03j3clag6ilp8` FOREIGN KEY (`productid`) REFERENCES `tb_product` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FKfrdw4cep1rm5uowdq2pb2pnk0` FOREIGN KEY (`restaurantid`) REFERENCES `tb_restaurant` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_product
-- ----------------------------
DROP TABLE IF EXISTS `tb_product`;
CREATE TABLE `tb_product`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `group_product_id` bigint(20) NULL DEFAULT NULL,
  `image` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `is_finished_product` bit(1) NULL DEFAULT NULL,
  `is_raw_material` bit(1) NULL DEFAULT NULL,
  `note` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `restaurant_id` bigint(20) NULL DEFAULT NULL,
  `title` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `unit_id` bigint(20) NULL DEFAULT NULL,
  `universal_pro_code` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_product
-- ----------------------------
INSERT INTO `tb_product` VALUES (1, 'aaa', 1, '1', b'1', b'1', 'aaa', 1, 'sanp 1', 1, '1');
INSERT INTO `tb_product` VALUES (2, 'bbb', 1, '1', b'1', b'1', 'test ', 1, 'san pham 2', 1, '1');

-- ----------------------------
-- Table structure for tb_rate_restaurant
-- ----------------------------
DROP TABLE IF EXISTS `tb_rate_restaurant`;
CREATE TABLE `tb_rate_restaurant`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `customer_id` bigint(20) NULL DEFAULT NULL,
  `rate_food` int(11) NULL DEFAULT NULL,
  `rate_image` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `rate_price` int(11) NULL DEFAULT NULL,
  `rate_quality` int(11) NULL DEFAULT NULL,
  `rate_service` int(11) NULL DEFAULT NULL,
  `rate_space` int(11) NULL DEFAULT NULL,
  `restaurant_id` bigint(20) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_restaurant
-- ----------------------------
DROP TABLE IF EXISTS `tb_restaurant`;
CREATE TABLE `tb_restaurant`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `mail` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `note` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `phone_number` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `title` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `website` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_restaurant
-- ----------------------------
INSERT INTO `tb_restaurant` VALUES (1, '1', '1', '1', '1', '1', '1');

-- ----------------------------
-- Table structure for tb_retail_product
-- ----------------------------
DROP TABLE IF EXISTS `tb_retail_product`;
CREATE TABLE `tb_retail_product`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `price` double NULL DEFAULT NULL,
  `product_id` bigint(20) NULL DEFAULT NULL,
  `restaurant_id` bigint(20) NULL DEFAULT NULL,
  `store_id` bigint(20) NULL DEFAULT NULL,
  `unit_id` bigint(20) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_salary_code
-- ----------------------------
DROP TABLE IF EXISTS `tb_salary_code`;
CREATE TABLE `tb_salary_code`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `department_id` bigint(20) NULL DEFAULT NULL,
  `month` datetime(0) NOT NULL,
  `restaurant_id` bigint(20) NULL DEFAULT NULL,
  `salary` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_sentiment
-- ----------------------------
DROP TABLE IF EXISTS `tb_sentiment`;
CREATE TABLE `tb_sentiment`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `namefile` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `qa` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `sentiment` int(11) NOT NULL,
  `tgian` bigint(20) NOT NULL,
  `tongtg` bigint(20) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_staffment
-- ----------------------------
DROP TABLE IF EXISTS `tb_staffment`;
CREATE TABLE `tb_staffment`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `department_id` bigint(20) NULL DEFAULT NULL,
  `id_card` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `identity_card` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `mail` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `note` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `password` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `phone` varchar(15) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `restaurant_id` bigint(20) NULL DEFAULT NULL,
  `startday` datetime(0) NOT NULL,
  `title` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_staffment
-- ----------------------------
INSERT INTO `tb_staffment` VALUES (1, '1', 1, '1', '1', '1', '1', '1', '1', 1, '2020-06-22 11:41:03', '11');

-- ----------------------------
-- Table structure for tb_store
-- ----------------------------
DROP TABLE IF EXISTS `tb_store`;
CREATE TABLE `tb_store`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `note` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `restaurant_id` bigint(20) NULL DEFAULT NULL,
  `title` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_store
-- ----------------------------
INSERT INTO `tb_store` VALUES (1, '1', 'test ', 1, 'test ');

-- ----------------------------
-- Table structure for tb_store_import_in_voice
-- ----------------------------
DROP TABLE IF EXISTS `tb_store_import_in_voice`;
CREATE TABLE `tb_store_import_in_voice`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `debt` float NOT NULL,
  `deposit` float NOT NULL,
  `invoice_date` datetime(0) NULL DEFAULT NULL,
  `invoice_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `payment` float NOT NULL,
  `status` tinyint(4) NULL DEFAULT NULL,
  `total` double NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_supplier
-- ----------------------------
DROP TABLE IF EXISTS `tb_supplier`;
CREATE TABLE `tb_supplier`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `code` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `fax` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `home_phone` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `note` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `pername` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `phone` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `taxcode` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `title` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_sys_diagrams
-- ----------------------------
DROP TABLE IF EXISTS `tb_sys_diagrams`;
CREATE TABLE `tb_sys_diagrams`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `definition` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `diagram_id` int(11) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `principal_id` int(11) NOT NULL,
  `version` int(11) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_test_demo
-- ----------------------------
DROP TABLE IF EXISTS `tb_test_demo`;
CREATE TABLE `tb_test_demo`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_timesheets
-- ----------------------------
DROP TABLE IF EXISTS `tb_timesheets`;
CREATE TABLE `tb_timesheets`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_staffment` bigint(20) NOT NULL,
  `month` datetime(0) NULL DEFAULT NULL,
  `number_date` float NOT NULL,
  `overtime` float NOT NULL,
  `year` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_type_imex_finance
-- ----------------------------
DROP TABLE IF EXISTS `tb_type_imex_finance`;
CREATE TABLE `tb_type_imex_finance`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `id_restaurant` bigint(20) NOT NULL,
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for tb_type_imex_product
-- ----------------------------
DROP TABLE IF EXISTS `tb_type_imex_product`;
CREATE TABLE `tb_type_imex_product`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `title` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_type_imex_product
-- ----------------------------
INSERT INTO `tb_type_imex_product` VALUES (1, '1', 'test demo');

-- ----------------------------
-- Table structure for tb_unit
-- ----------------------------
DROP TABLE IF EXISTS `tb_unit`;
CREATE TABLE `tb_unit`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `description` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `id_restaurant` bigint(20) NOT NULL,
  `title` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `unit_symbol` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_unit
-- ----------------------------
INSERT INTO `tb_unit` VALUES (1, 'ab ', 1, 'kg', '1');

SET FOREIGN_KEY_CHECKS = 1;
