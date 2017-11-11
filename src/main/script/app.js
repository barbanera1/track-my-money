// const React = require('react');
// const ReactDOM = require('react-dom');
// const client = require('./client');
//
// class App extends React.Component {
//     constructor(props){
//         super(props);
//         this.state = {transactions: []}
//     }
//
//     componentDidMount() {
//         client({method: 'GET', path: '/api/transactions'}).done(response => {
//             this.setState({transactions: response.entity._embedded.transactions})
//         });
//     }
//
//     render() {
//         return (
//             <TransactionList transactions={this.state.transactions}/>
//         )
//     }
// }
//
// class TransactionList extends React.Component{
//     render() {
//         var transactions = this.props.transactions.map(transaction =>
//             <Transaction key={transaction._links.self.href} transaction={transaction}/>
//         );
//         return (
//             <table>
//                 <tbody>
//                 <tr>
//                     <th>Trax_num</th>
//                 </tr>
//                 {transactions}
//                 </tbody>
//             </table>
//         )
//     }
// }
//
// class Transaction extends React.Component{
//     render(){
//         return(
//             <tr>
//                 <td>{this.props.transaction.trax_num}</td>
//             </tr>
//         )
//     }
// }
//
// ReactDOM.render(
//     <App />,
//     document.getElementById('react'),
//     console.log("I am here")
// )