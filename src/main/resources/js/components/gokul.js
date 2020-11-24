import React, { Component } from 'react';
import ReactDOM from 'react-dom';

export default class Gokul extends Component {
    render() {
        return (
            <div className="container">
                <div className="row justify-content-center">
                    <div className="col-md-8">
                        <div className="card">

                            <div className="card-header">Gokul</div>

                            <div className="card-body">this is working on employee branch</div>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

if (document.getElementById('component-gokul')) {
    ReactDOM.render(<Gokul />, document.getElementById('component-gokul'));
}