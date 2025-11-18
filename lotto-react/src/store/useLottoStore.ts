import { create } from "zustand";

interface LottoState {
  lottos: number[][];
  setLottos: (lottos: number[][]) => void;
}

const useLottoStore = create<LottoState>((set) => ({
  lottos: [[]],
  setLottos: (lottos) => set(() => ({ lottos: lottos })),
}));

export default useLottoStore;
