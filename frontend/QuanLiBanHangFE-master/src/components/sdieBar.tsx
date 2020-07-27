import React from "react";
import "antd/dist/antd.css";
import { Layout, Menu } from "antd";
import {
  UserOutlined,
  LaptopOutlined,
  NotificationOutlined,
} from "@ant-design/icons";
import { Link } from "react-router-dom";
import StoreHouseComponent from "../pages/storeHouse/storeHouse";
import ProductComponent from "../pages/products/product";
import SupplierComponent from "../pages/suppliers/supplier";
import StaffmentComponent from "../pages/staffment/staffment";
import HistoryExportProductComponent from "../pages/historyExportProduct/index";
import ImportProductComponent from "../pages/importProduct/index";
import ExportProductComponent from "../pages/exportProduct/index";
import ChangeStoreHouseComponent from "../pages/changeStoreHouse/index";
import ListOfBillImportComponent from "../pages/listOfBillImport/index";
import ListOfBillExportComponent from "../pages/listOfBillExport/index";
import HistoryOfChangeStoreHouseComponent from "../pages/historyOfChangeStoreHouse/index";
import InventoryProductComponent from "../pages/inventoryProduct/index";
import CustomerComponent from "../pages/customers/customers";


const { SubMenu } = Menu;
const { Sider } = Layout;
const data: any = [];
  for (let i = 0; i < 46; i++) {
    data.push({
      name: `Edward King ${i}`,
      age: 32,
      address: `London, Park Lane no. ${i}`,
    });
  }
let columns: any = [];
let title = Object.keys(data[0]);
title.map(item => {
  let columnOb = {
    title: "",
    dataIndex: ""
  };
  columnOb.title = item;
  columnOb.dataIndex = item.toLowerCase();
  columns.push(columnOb);
})

class SideBarComponent extends React.Component<any, any> {
  constructor(props: any) {
    super(props);
    this.state = {
      collapsed: false,
      nameOfContent: ""
    };
  }
  

  _changeContent = (name: String) => {
      this.setState({
          nameOfContent: name
      })
  }

  toggle = () => {
    this.setState({
      collapsed: !this.state.collapsed,
    });
  };

  _showContent = () => {
      switch(this.state.nameOfContent) {
          case "Kho":
            return ( 
            <Layout>
                <StoreHouseComponent />
            </Layout>);
            break;
          case "Hang hoa": 
          return (
            <Layout>
                <ProductComponent />
            </Layout>
          );
          break;
          case "Nha cung cap": 
          return (
            <Layout>
                <SupplierComponent />
            </Layout>
          );
          break;
          case "Nhan vien": 
          return (
            <Layout>
                <StaffmentComponent />
            </Layout>
          );
          break;
          case "Hang hoa": 
          return (
            <Layout>
                <ProductComponent />
            </Layout>
          );
          break;
          case "Nhap Hang Hoa": 
          return (
            <Layout>
                <ImportProductComponent />
            </Layout>
          );
          break;
          case "Xuat Hang Hoa": 
          return (
            <Layout>
                <ExportProductComponent />
            </Layout>
          );
          break;
          case "Chuyen Kho": 
          return (
            <Layout>
                <ChangeStoreHouseComponent />
            </Layout>
          );
          break;
          case "Danh Sach Hoa Don Nhap": 
          return (
            <Layout>
                <ListOfBillImportComponent />
            </Layout>
          );
          break;
          case "Danh Sach Hoa Don Xuat": 
          return (
            <Layout>
                <ListOfBillExportComponent />
            </Layout>
          );
          break;
          case "Lich Su Chuyen Kho": 
          return (
            <Layout>
                <HistoryOfChangeStoreHouseComponent />
            </Layout>
          );
          break;
          case "Lich Su Nhap Hang": 
          return (
            <Layout>
                <ImportProductComponent />
            </Layout>
          );
          case "Lich Su Xuat Hang Hoa": 
          return (
            <Layout>
                <HistoryExportProductComponent />
            </Layout>
          );
          break;
          case "Kiem ke Hang Hoa": 
          return (
            <Layout>
                <InventoryProductComponent />
            </Layout>
          );
          break;
          case "Khach Hang": 
          return (
            <Layout>
                <CustomerComponent />
            </Layout>
          );
          break;
          default:
              return "";
              break;
      }
  }

  render() {
    return (
      <Layout>
        <Sider
          width={200}
          className="site-layout-background"
          trigger={null}
          
          collapsed={this.state.collapsed}
        >
          <Menu
            mode="inline"
            defaultSelectedKeys={["1"]}
            defaultOpenKeys={["sub1"]}
            style={{ height: "100%", borderRight: 0 }}
          >
            <SubMenu key="sub1" icon={<UserOutlined />} title="Danh mục">
              <Menu.Item key="1" onClick={() => this._changeContent("Kho")}>
              <Link to="/store" >Kho</Link>
              </Menu.Item>
              <Menu.Item key="2" onClick={() => this._changeContent("Hang hoa")}>
                <Link to="/product">Hàng hóa</Link>
              </Menu.Item>
              <Menu.Item key="3" onClick={() => this._changeContent("Nhan vien")}>
              <Link to="/staffment" >Nhân viên</Link>
              </Menu.Item>
              <Menu.Item key="4">
              <Link to="/customer" onClick={() => this._changeContent("Khach Hang")}>Khách hàng</Link>
              </Menu.Item>
              <Menu.Item key="5" onClick={() => this._changeContent("Nha cung cap")}>
              <Link to="/supplier" >Nhà cung cấp</Link>
              </Menu.Item>
            </SubMenu>
            <SubMenu key="sub2" icon={<LaptopOutlined />} title="Quản lí hàng hóa">
              <Menu.Item key="5" onClick={() => this._changeContent("Nhap Hang Hoa")}>
              <Link to="/importProduct" >Nhập hàng hóa</Link>
              </Menu.Item>
              <Menu.Item key="6" onClick={() => this._changeContent("Xuat Hang Hoa")}>
              <Link to="/exportProduct" >Xuất hàng hóa</Link>
              </Menu.Item>
              <Menu.Item key="7" onClick={() => this._changeContent("Chuyen Kho")}>
              <Link to="/changeStore" >Chuyển kho</Link>
              </Menu.Item>
              <Menu.Item key="8" onClick={() => this._changeContent("Danh Sach Hoa Don Nhap")}>
              <Link to="/listOfImportBill" >Danh sách hóa đơn nhập</Link>
              </Menu.Item>
              <Menu.Item key="9" onClick={() => this._changeContent("Danh Sach Hoa Don Xuat")}>
              <Link to="/listOfBillExport" >Danh sách hóa đơn xuất</Link>
              </Menu.Item>
              <Menu.Item key="10" onClick={() => this._changeContent("Lich Su Chuyen Kho")}>
              <Link to="/historyOfChangeStore" >Lịch sử chuyển kho</Link>
              </Menu.Item>
              <Menu.Item key="12" onClick={() => this._changeContent("Lich Su Nhap Hang")}>
              <Link to="/store" >Lịch sử nhập hàng</Link>
              </Menu.Item>
              <Menu.Item key="11" onClick={() => this._changeContent("Lich Su Xuat Hang Hoa")}>
              <Link to="/historyOfImportProduct" >Lịch sử xuất hàng hóa</Link>
              </Menu.Item>
              <Menu.Item key="12" onClick={() => this._changeContent("Kiem ke Hang Hoa")}>
              <Link to="/inventoryProduct" >Kiểm kê hàng hóa</Link>
              </Menu.Item>
             
              
            </SubMenu>
            <SubMenu
              key="sub3"
              icon={<NotificationOutlined />}
              title="subnav 3"
            >
              <Menu.Item key="9">option9</Menu.Item>
              <Menu.Item key="10">option10</Menu.Item>
              <Menu.Item key="11">option11</Menu.Item>
              <Menu.Item key="12">option12</Menu.Item>
            </SubMenu>
          </Menu>
        </Sider>
        {this._showContent()}

      </Layout>
    );
  }
}

export default SideBarComponent;
