import produce from 'immer';

export enum ActionTypes {
  DataRequest = 'DATA_REQUEST',
  DataSuccess = 'DATA_SUCCESS',
  DataFailure = 'DATA_FAILURE',
}

export type Action = any;

export type State = any;

const defaultState: State = {
  data: {},
  isLoading: true,
  error: undefined,
};

export const rootReducer = (state = defaultState, action: Action) =>
  produce(state, draft => {
    switch (action.type) {
      case ActionTypes.DataRequest:
        draft.isLoading = true;
        draft.error = undefined;
        break;

      case ActionTypes.DataFailure:
        draft.isLoading = false;
        draft.error = action.error;
        break;

      case ActionTypes.DataSuccess:
        draft.isLoading = false;
        draft.data = action.data;
        draft.error = undefined;
        break;
    }
  });
