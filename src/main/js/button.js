'use strict'

const React = require('react');
const ReactDOM = require('react-dom');

class App extends React.Component {

    constructor(props) {
        super(props);
    }

    render() {
        return(
            <button>Hello</button>
        )
    }
}

ReactDOM.render(
    <App />,
    document.getElementById('react')
)