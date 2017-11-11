const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');

class App extends React.Component {
    constructor(props) {
        super(props);
    }

    render(){
        return(
            <button>Hello there</button>
        )
    }
}

ReactDOM.render(
    <App />,
    document.getElementById('react')
)