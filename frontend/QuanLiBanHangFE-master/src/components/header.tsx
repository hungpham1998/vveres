import React from "react";
import "antd/dist/antd.css";
import { Layout, Menu } from "antd";

const { Header } = Layout;

class HeaderComponent extends React.Component<any, any> {
  constructor(props: any) {
    super(props);
    this.state = {
      collapsed: false,
    };
  }

  toggle = () => {
    this.setState({
      collapsed: !this.state.collapsed,
    });
  };

  render() {
    return (
    
        <Header className="header">
          <div className="logo" />
          <Menu theme="dark" mode="horizontal" defaultSelectedKeys={["2"]}>
            <Menu.Item key="1">Trang chủ</Menu.Item>
            <Menu.Item key="2"></Menu.Item>
            <Menu.Item key="3">nav 3</Menu.Item>
          </Menu>
        </Header>
    );
  }
}

export default HeaderComponent;
