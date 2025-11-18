import { create } from "zustand";

export type Winner = "FIRST" | "SECOND" | "THIRD" | "FOURTH" | "FIFTH" | "MISS";

export const WinnerLabel: Record<Winner, string> = {
  FIRST: "1등",
  SECOND: "2등",
  THIRD: "3등",
  FOURTH: "4등",
  FIFTH: "5등",
  MISS: "낙첨",
};

interface LottoState {
  lottos: number[][];
  setLottos: (lottos: number[][]) => void;

  lottosResult: string[];
  setLottosResult: (result: string[]) => void;
}

const useLottoStore = create<LottoState>((set) => ({
  lottos: [],
  setLottos: (lottos) => set(() => ({ lottos: lottos })),

  lottosResult: [],
  setLottosResult: (result) => set(() => ({ lottosResult: result })),
}));

export default useLottoStore;
