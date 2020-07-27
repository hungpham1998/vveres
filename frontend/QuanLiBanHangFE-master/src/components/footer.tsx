import React from "react";
import "antd/dist/antd.css";
import { Layout } from "antd";

const { Footer } = Layout;

class FooterComponent extends React.Component<any, any> {
  render() {
    return (
      <Layout>
        <Footer style={{ textAlign: "center" }}>
          Ant Design ©2018 Created by Ant UED
        </Footer>
      </Layout>
    );
  }
}

export default FooterComponent;
