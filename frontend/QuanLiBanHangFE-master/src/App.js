import React from 'react';
import './App.css';
import SideBarComponent from "../src/components/sdieBar";
import HeaderComponent from './components/header';
import FooterComponent from './components/footer';
import { Switch, Route, BrowserRouter as Router } from 'react-router-dom';
import routes from "./routes/routes";
class App extends React.Component {
  

  showContentMenus = (routes) => {
    var result = null;
    if (routes.length > 0) {
        result = routes.map((route, index) => {
            return (
                <Route
                    key={index}
                    path={route.path}
                    exact={route.exact}
                />
            );
        });
    }
    return <Switch>{result}</Switch>;
    
    }

    render() {
      return (
        <Router>
           <HeaderComponent />
           <SideBarComponent />
           <FooterComponent />
           {this.showContentMenus(routes)}
        </Router>
       );
    }
}

export default App;
