import React from 'react';
import { connect } from 'react-redux';
import logo from '../logo.svg';
import { Action, ActionTypes, State } from '../store';
import './App.scss';

interface Props {
  isLoading: boolean;
  dispatch: (action: Action) => any;
}

const App = (props: Props) => {
  return (
    <div className='App'>
      <header className='App-header'>
        <img src={logo} className='App-logo' alt='logo' />
        <span
          onClick={
            props.isLoading
              ? () =>
                  props.dispatch({ type: ActionTypes.DataSuccess, data: {} })
              : () => props.dispatch({ type: ActionTypes.DataRequest })
          }
        >
          {props.isLoading ? 'Loading!' : 'Not loading'}
        </span>
        <p>
          Edit <code>src/App.tsx</code> and save to reload.
        </p>
        <a
          className='App-link'
          href='https://reactjs.org'
          target='_blank'
          rel='noopener noreferrer'
        >
          Learn React
        </a>
      </header>
    </div>
  );
};

const connectedComponent = connect(({ isLoading }: State) => ({ isLoading }))(
  App
);
export { connectedComponent as App };
